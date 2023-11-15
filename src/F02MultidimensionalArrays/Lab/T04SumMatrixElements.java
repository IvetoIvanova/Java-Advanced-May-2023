package F02MultidimensionalArrays.Lab;

import java.util.Scanner;

public class T04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readDimensions(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(scanner, rows, cols);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(calculateSum(matrix));
    }

    private static int[] readDimensions(Scanner scanner) {
        String dimensionsString = scanner.nextLine().replaceAll("\\s+", "");
        String[] dimensionsArray = dimensionsString.split(",");

        int[] dimensions = new int[2];

        if (dimensionsArray.length == 2) {
            dimensions[0] = Integer.parseInt(dimensionsArray[0]);
            dimensions[1] = Integer.parseInt(dimensionsArray[1]);
        }

        return dimensions;
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().split(",");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j].trim());
            }
        }

        return matrix;
    }

    private static int calculateSum(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }
}