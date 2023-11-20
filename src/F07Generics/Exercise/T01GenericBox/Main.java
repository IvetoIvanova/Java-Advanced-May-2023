package F07Generics.Exercise.T01GenericBox;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Box<String> box = new Box<>(input);
            System.out.println(box.toString());
        }
    }
}
