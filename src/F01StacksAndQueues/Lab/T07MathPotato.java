package F01StacksAndQueues.Lab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class T07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = scanner.nextInt();

        PriorityQueue<String> queue = new PriorityQueue<>();

        int cycle = 1;

        for (String name : names) {
            queue.offer(name);
        }

        while (queue.size() > 1) {

            for (int i = 1; i < n; i++) {
                String move = queue.poll();
                queue.offer(move);
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int cycle) {

        if (cycle <= 1) {
            return false;
        }

        for (int i = 2; i < cycle; i++) {

            if (cycle % i == 0) {
                return false;
            }
        }
        return true;
    }
}