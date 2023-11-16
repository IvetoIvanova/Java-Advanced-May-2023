package F03SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class T01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            names.add(username);
        }

        names.forEach(System.out::println);
    }
}
