package F07Generics.Exercise.T07CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];

            switch (action) {
                case "Add":
                    customList.add(tokens[1]);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    System.out.println(customList.contains(tokens[1]));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
