import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class T06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayBounds = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int lowerBound = arrayBounds[0];
        int upperBound = arrayBounds[1];
        String command = scanner.nextLine();

        if (command.equals("odd")) {
            printNumbersInRange(lowerBound, upperBound, isOdd());
        } else if (command.equals("even")) {
            printNumbersInRange(lowerBound, upperBound, isEven());
        }
    }

    private static void printNumbersInRange(int lowerBound, int upperBound, Predicate<Integer> predicate) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            if (predicate.test(i)) {
                filteredNumbers.add(i);
            }
        }
        System.out.println(filteredNumbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static Predicate<Integer> isEven() {
        return num -> num % 2 == 0;
    }

    private static Predicate<Integer> isOdd() {
        return num -> num % 2 != 0;
    }
}