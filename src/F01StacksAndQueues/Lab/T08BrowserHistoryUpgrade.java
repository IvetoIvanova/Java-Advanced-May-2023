package F01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();
        String navigation = "";
        String currentUrl = "";

        while (true) {
            navigation = scanner.nextLine();

            if (navigation.equals("Home")) {
                break;
            }

            if (navigation.equals("back")) {
                if (!history.isEmpty()) {
                    forwardPages.push(currentUrl);
                    currentUrl = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    continue;
                }
            } else if (navigation.equals("forward")) {
                if (!forwardPages.isEmpty()) {
                    history.push(currentUrl);
                    currentUrl = forwardPages.pop();
                } else {
                    System.out.println("no next URLs");
                    continue;
                }
            } else {
                if (!currentUrl.isEmpty()) {
                    history.push(currentUrl);
                }
                currentUrl = navigation;
                forwardPages.clear();
            }

            System.out.println(currentUrl);
        }
    }
}