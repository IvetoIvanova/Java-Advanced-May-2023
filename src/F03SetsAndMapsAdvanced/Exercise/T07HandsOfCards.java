package F03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T07HandsOfCards {
    private static Map<String, Integer> multipliers = new HashMap<>();
    private static Map<String, Integer> cardsPowers = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        multipliers.put("S", 4);
        multipliers.put("H", 3);
        multipliers.put("D", 2);
        multipliers.put("C", 1);

        cardsPowers.put("2", 2);
        cardsPowers.put("3", 3);
        cardsPowers.put("4", 4);
        cardsPowers.put("5", 5);
        cardsPowers.put("6", 6);
        cardsPowers.put("7", 7);
        cardsPowers.put("8", 8);
        cardsPowers.put("9", 9);
        cardsPowers.put("10", 10);
        cardsPowers.put("J", 11);
        cardsPowers.put("Q", 12);
        cardsPowers.put("K", 13);
        cardsPowers.put("A", 14);

        String input = scanner.nextLine();
        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            String[] tokens = input.split(":");
            String name = tokens[0];
            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }

            String[] cards = tokens[1].trim().split(", ");
            for (String card : cards) {
                players.get(name).add(card);
            }
            input = scanner.nextLine();
        }

        players.forEach((k, v) -> {
            String player = k;
            int points = calculatePoints(v);
            System.out.printf("%s: %d\n", player, points);
        });
    }

    private static int calculatePoints(HashSet<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String multiplier = card.substring(card.length() - 1);
            points += cardsPowers.get(power) * multipliers.get(multiplier);
        }
        return points;
    }
}