import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class T09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] divisors = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Predicate<Integer> isDivisibleByAll = num ->
                Arrays.stream(divisors).allMatch(divisor -> num % divisor == 0);


        int[] result = IntStream.rangeClosed(1, N)
                .boxed()
                .filter(isDivisibleByAll)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
    }
}