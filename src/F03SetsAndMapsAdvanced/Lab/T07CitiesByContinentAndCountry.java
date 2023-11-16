package F03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class T07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        while (rows-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            String continent = data[0];
            String country = data[1];
            String city = data[2];

            map.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countryWithCities = map.get(continent);
            countryWithCities.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countryWithCities.get(country);
            cities.add(city);
        }

        map.forEach((continent, countryWithCities) -> {

            System.out.println(continent + ":");

            countryWithCities.forEach((key, value) -> System.out.println("  " + key + " -> " + String.join(", ", value)));
        });
    }
}