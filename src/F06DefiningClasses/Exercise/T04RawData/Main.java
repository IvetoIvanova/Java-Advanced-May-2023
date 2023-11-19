package T04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];

            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < carInfo.length; j += 2) {
                double tirePressure = Double.parseDouble(carInfo[j]);
                int tireAge = Integer.parseInt(carInfo[j + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires.add(tire);
            }

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String command = scanner.nextLine();

        if ("fragile".equals(command)) {
            cars.stream()
                    .filter(Car::isFragile)
                    .forEach(System.out::println);
        } else if ("flamable".equals(command)) {
            cars.stream()
                    .filter(Car::isFlammable)
                    .forEach(System.out::println);
        }
    }
}
