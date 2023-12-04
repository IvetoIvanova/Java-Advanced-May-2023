package F07Generics.Exercise.T11Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String[] input3 = scanner.nextLine().split(" ");

        Threeuple<String, String, String> threeuple1 = new Threeuple<>(input1[0] + " " + input1[1], input1[2], input1[3]);
        Threeuple<String, Double, Boolean> threeuple2 = new Threeuple<>(input2[0], Double.parseDouble(input2[1]), input2[2].equals("drunk"));
        Threeuple<String, Double, String> threeuple3 = new Threeuple<>(input3[0], Double.parseDouble(input3[1]), input3[2]);

        System.out.println(threeuple1.getItem1() + " -> " + threeuple1.getItem2() + " -> " + threeuple1.getItem3());
        System.out.printf("%s -> %.0f -> %b%n", threeuple2.getItem1(), threeuple2.getItem2(), threeuple2.getItem3());
        System.out.println(threeuple3.getItem1() + " -> " + threeuple3.getItem2() + " -> " + threeuple3.getItem3());
    }
}
