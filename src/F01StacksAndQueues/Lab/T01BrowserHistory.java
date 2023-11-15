package F01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String navigation = scanner.nextLine();
        String currentUrl = "";

        while (!navigation.equals("Home")) {

            if (navigation.equals("back")) {

                if (!history.isEmpty()) {
                    currentUrl = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    navigation = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentUrl.isEmpty()) {
                    history.push(currentUrl);
                }
                currentUrl = navigation;
            }
            System.out.println(currentUrl);
            navigation = scanner.nextLine();
        }
    }
}