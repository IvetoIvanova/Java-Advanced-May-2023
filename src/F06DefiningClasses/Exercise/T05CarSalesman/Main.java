package T05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);

            Integer displacement = null;
            String efficiency = null;

            if (engineInfo.length > 2) {
                if (Character.isDigit(engineInfo[2].charAt(0))) {
                    displacement = Integer.parseInt(engineInfo[2]);
                } else {
                    efficiency = engineInfo[2];
                }
            }

            if (engineInfo.length > 3) {
                if (displacement == null) {
                    if (Character.isDigit(engineInfo[3].charAt(0))) {
                        displacement = Integer.parseInt(engineInfo[3]);
                    } else {
                        efficiency = engineInfo[3];
                    }
                } else {
                    efficiency = engineInfo[3];
                }
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.put(model, engine);
        }

        int m = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            String engineModel = carInfo[1];
            Engine engine = engines.get(engineModel);

            Integer weight = null;
            String color = null;

            if (carInfo.length > 2) {
                if (Character.isDigit(carInfo[2].charAt(0))) {
                    weight = Integer.parseInt(carInfo[2]);
                } else {
                    color = carInfo[2];
                }
            }

            if (carInfo.length > 3) {
                if (weight == null) {
                    if (Character.isDigit(carInfo[3].charAt(0))) {
                        weight = Integer.parseInt(carInfo[3]);
                    } else {
                        color = carInfo[3];
                    }
                } else {
                    color = carInfo[3];
                }
            }

            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }

        cars.forEach(System.out::print);
    }
}