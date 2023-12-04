package F07Generics.Exercise.T10Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String[] input3 = scanner.nextLine().split(" ");

        Tuple<String, String> tuple1 = new Tuple<>(input1[0] + " " + input1[1], input1[2]);
        Tuple<String, Double> tuple2 = new Tuple<>(input2[0], Double.parseDouble(input2[1]));
        Tuple<Integer, Double> tuple3 = new Tuple<>(Integer.parseInt(input3[0]), Double.parseDouble(input3[1]));

        System.out.println(tuple1.getItem1() + " -> " + tuple1.getItem2());
        System.out.printf("%s -> %.0f%n", tuple2.getItem1(), tuple2.getItem2());
        System.out.println(tuple3.getItem1() + " -> " + tuple3.getItem2());
    }
}
