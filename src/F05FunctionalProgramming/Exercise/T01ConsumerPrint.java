import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class T01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        Consumer<String> print = System.out::println;

        Arrays.stream(strings).forEach(print);
    }
}