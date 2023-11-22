package F10ExamTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> maleStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(maleStack::push);

        Deque<Integer> femaleQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(femaleQueue::offer);

        int matches = 0;
        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()) {

            int male = maleStack.peek();
            int female = femaleQueue.peek();

            if (female <= 0) {
                femaleQueue.poll();
                continue;
            } else if (male <= 0) {
                maleStack.pop();
                continue;
            }

            if (female % 25 == 0) {
                femaleQueue.poll();
                femaleQueue.poll();
                continue;
            } else if (male % 25 == 0) {
                maleStack.pop();
                maleStack.pop();
                continue;
            }

            if (male == female) {
                matches++;
                maleStack.pop();
                femaleQueue.poll();
            } else {
                femaleQueue.poll();
                int decreaseMale = maleStack.pop() - 2;
                maleStack.push(decreaseMale);
            }
        }

        System.out.printf("Matches: %d\n", matches);

        if (maleStack.isEmpty()) {
            System.out.println("Males left: none");
        } else {
            String result = maleStack.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Males left: %s\n", result);
        }

        if (femaleQueue.isEmpty()) {
            System.out.println("Females left: none");
        } else {
            String result = femaleQueue.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Females left: %s", result);
        }
    }
}
