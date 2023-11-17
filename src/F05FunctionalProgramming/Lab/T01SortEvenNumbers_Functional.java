import java.util.*;
import java.util.stream.Collectors;

public class T01SortEvenNumbers_Functional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        printListWithComa(numbers);

        Collections.sort(numbers);

        printListWithComa(numbers);
    }

    private static void printListWithComa(List<Integer> numbers) {
        List<String> numbersAsText = new ArrayList<>();
        for (int number : numbers) {
            numbersAsText.add(String.valueOf(number));
        }
        System.out.println(String.join(", ", numbersAsText));
    }
}