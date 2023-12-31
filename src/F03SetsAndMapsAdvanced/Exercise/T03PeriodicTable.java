package F03SetsAndMapsAdvanced.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueElements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            String[] chemicalElements = scanner.nextLine().split("\\s+");
            uniqueElements.addAll(Arrays.asList(chemicalElements));
        }

        uniqueElements.forEach(el -> System.out.print(el + " "));
    }
}