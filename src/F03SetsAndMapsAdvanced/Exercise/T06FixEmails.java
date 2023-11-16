package F03SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> mails = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")) {
                mails.put(name, email);
            }

            name = scanner.nextLine();
        }
        mails.forEach((k, v) -> System.out.printf("%s -> %s\n", k, v));
    }
}