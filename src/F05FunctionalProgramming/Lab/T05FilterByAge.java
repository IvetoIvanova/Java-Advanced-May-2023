import java.util.Scanner;

public class T05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String[] names = new String[N];
        int[] ages = new int[N];

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(", ");
            names[i] = input[0];
            ages[i] = Integer.parseInt(input[1]);
        }

        String condition = scanner.nextLine();
        int filterAge = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        filterAndPrint(names, ages, condition, filterAge, format);
    }

    private static void filterAndPrint(String[] names, int[] ages, String condition, int filterAge, String format) {
        for (int i = 0; i < names.length; i++) {
            boolean conditionMet;

            if (condition.equals("younger")) {
                conditionMet = ages[i] <= filterAge;
            } else {
                conditionMet = ages[i] >= filterAge;
            }

            if (conditionMet) {
                printFormatted(names[i], ages[i], format);
            }
        }
    }

    private static void printFormatted(String name, int age, String format) {
        switch (format) {
            case "name":
                System.out.println(name);
                break;
            case "age":
                System.out.println(age);
                break;
            case "name age":
                System.out.println(name + " - " + age);
                break;
        }
    }
}