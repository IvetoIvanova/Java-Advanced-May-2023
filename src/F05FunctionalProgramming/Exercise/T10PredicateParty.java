import java.util.*;
import java.util.stream.Collectors;

public class T10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];

            switch (action) {
                case "Double":
                    applyDoubleCriteria(guests, tokens[1], tokens[2]);
                    break;
                case "Remove":
                    applyRemoveCriteria(guests, tokens[1], tokens[2]);
                    break;
            }

            command = scanner.nextLine();
        }

        printGuests(guests);
    }

    private static void applyDoubleCriteria(List<String> guests, String criteriaType, String criteria) {
        List<String> guestsToAdd = new ArrayList<>();
        switch (criteriaType) {
            case "StartsWith":
                guestsToAdd.addAll(guests.stream().filter(guest -> guest.startsWith(criteria)).collect(Collectors.toList()));
                break;
            case "EndsWith":
                guestsToAdd.addAll(guests.stream().filter(guest -> guest.endsWith(criteria)).collect(Collectors.toList()));
                break;
            case "Length":
                int length = Integer.parseInt(criteria);
                guestsToAdd.addAll(guests.stream().filter(guest -> guest.length() == length).collect(Collectors.toList()));
                break;
        }

        guests.addAll(guestsToAdd);
    }

    private static void applyRemoveCriteria(List<String> guests, String criteriaType, String criteria) {
        guests.removeIf(guest -> {
            switch (criteriaType) {
                case "StartsWith":
                    return guest.startsWith(criteria);
                case "EndsWith":
                    return guest.endsWith(criteria);
                case "Length":
                    int length = Integer.parseInt(criteria);
                    return guest.length() == length;
                default:
                    return false;
            }
        });
    }

    private static void printGuests(List<String> guests) {
        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            String result = guests.stream()
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.joining(", ")) + " are going to the party!";
            System.out.println(result);
        }
    }
}