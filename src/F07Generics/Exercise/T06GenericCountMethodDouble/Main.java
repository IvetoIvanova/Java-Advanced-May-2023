package F07Generics.Exercise.T06GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<Double>> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            boxes.add(new Box<>(input));
        }

        double valueToCompare = Double.parseDouble(scanner.nextLine());

        int count = Box.countGreaterThan(boxes, valueToCompare);
        System.out.println(count);
    }
}
