package F01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class T02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] expressionArr = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, expressionArr);

        while (stack.size() > 1) {
            int first = Integer.valueOf(stack.pop());
            String operation = stack.pop();
            int second = Integer.valueOf(stack.pop());

            switch (operation) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}