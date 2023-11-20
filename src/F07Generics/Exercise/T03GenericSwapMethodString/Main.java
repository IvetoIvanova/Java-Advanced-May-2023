package F07Generics.Exercise.T03GenericSwapMethodString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            boxes.add(input);
        }

        String[] swapCommand = scanner.nextLine().split("\\s+");
        int index1 = Integer.parseInt(swapCommand[0]);
        int index2 = Integer.parseInt(swapCommand[1]);

        BoxSwapper.swapElements(boxes, index1, index2);

        for (String box : boxes) {
            System.out.println(box.getClass().getName() + ": " + box);
        }
    }
}