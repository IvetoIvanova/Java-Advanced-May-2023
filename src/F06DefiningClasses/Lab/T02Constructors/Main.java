package T02Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < countCars; count++) {
            String[] dataArr = scanner.nextLine().split("\\s+");

            String brand = dataArr[0];
            if ((dataArr.length) <= 1) {
                Car car = new Car(brand);
                System.out.println(car);
                continue;
            }
            String model = dataArr[1];
            int hp = Integer.parseInt(dataArr[2]);

            Car car = new Car(brand, model, hp);

            System.out.println(car);
        }
    }
}