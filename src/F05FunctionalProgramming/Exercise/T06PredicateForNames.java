import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLength = Integer.parseInt(scanner.nextLine()); // Максимална дължина на името

        String[] names = scanner.nextLine().split("\\s+");

        printNamesByLength(names, maxLength);
    }

    private static void printNamesByLength(String[] names, int maxLength) {
        Predicate<String> lengthCheck = name -> name.length() <= maxLength;

        List<String> filteredNames = filterNames(names, lengthCheck);

        filteredNames.forEach(System.out::println);
    }

    private static List<String> filterNames(String[] names, Predicate<String> condition) {
        return Arrays.stream(names)
                .filter(condition)
                .collect(Collectors.toList());
    }
}