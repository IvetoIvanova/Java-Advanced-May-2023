package F03SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class T06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);
        }

        shops.forEach((shop, products) -> {
            System.out.printf("%s->%n", shop);
            products.forEach((product, price) ->
                    System.out.printf("Product: %s, Price: %.1f%n", product, price));
        });
    }
}