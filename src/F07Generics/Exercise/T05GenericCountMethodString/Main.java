package F07Generics.Exercise.T05GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            boxes.add(new Box<>(input));
        }

        String valueToCompare = scanner.nextLine();

        int count = Box.countGreaterThan(boxes, valueToCompare);
        System.out.println(count);
    }
}
