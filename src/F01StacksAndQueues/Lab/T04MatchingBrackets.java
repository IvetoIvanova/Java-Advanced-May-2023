package F01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        ArrayDeque<Integer> openIndexes = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (current == '(') {
                openIndexes.push(i);
            } else if (current == ')') {
                int lastOpenIndex = openIndexes.pop();
                String subExpression = expression.substring(lastOpenIndex, i + 1);
                System.out.println(subExpression);
            }
        }
    }
}