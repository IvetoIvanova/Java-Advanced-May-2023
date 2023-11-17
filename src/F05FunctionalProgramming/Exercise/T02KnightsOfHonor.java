import java.util.Scanner;
import java.util.function.Consumer;

public class T02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> appendSir = name -> System.out.println("Sir " + name);

        for (String name : names) {
            appendSir.accept(name);
        }
    }
}