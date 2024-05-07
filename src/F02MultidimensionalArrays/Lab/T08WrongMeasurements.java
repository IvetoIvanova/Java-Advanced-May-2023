package F02MultidimensionalArrays.Lab;

import java.util.Scanner;

public class T08WrongMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            String[] rowValues = sc.nextLine().split(" ");
            matrix[i] = new int[rowValues.length];
            for (int j = 0; j < rowValues.length; j++) {
                matrix[i][j] = Integer.parseInt(rowValues[j]);
            }
        }

        String[] wrongValueInput = sc.nextLine().split(" ");
        int wrongValueRow = Integer.parseInt(wrongValueInput[0]);
        int wrongValueCol = Integer.parseInt(wrongValueInput[1]);

        fixTheMatrix(matrix, wrongValueRow, wrongValueCol);

        printTheMatrix(matrix);
    }

    public static void fixTheMatrix(int[][] matrix, int wrongValueRow, int wrongValueCol) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (wrongValueRow < 0 || wrongValueRow >= rows || wrongValueCol < 0 || wrongValueCol >= cols) {
            return;
        }

        int wrongValue = matrix[wrongValueRow][wrongValueCol];
        int[][] copyOfTheMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(matrix[i], 0, copyOfTheMatrix[i], 0, cols);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (copyOfTheMatrix[i][j] == wrongValue) {
                    int sum = 0;
                    //up
                    if (i - 1 >= 0 && copyOfTheMatrix[i - 1][j] != wrongValue) {
                        sum += copyOfTheMatrix[i - 1][j];
                    }
                    //down
                    if (i + 1 < rows && copyOfTheMatrix[i + 1][j] != wrongValue) {
                        sum += copyOfTheMatrix[i + 1][j];
                    }
                    //left
                    if (j - 1 >= 0 && copyOfTheMatrix[i][j - 1] != wrongValue) {
                        sum += copyOfTheMatrix[i][j - 1];
                    }
                    //right
                    if (j + 1 < cols && copyOfTheMatrix[i][j + 1] != wrongValue) {
                        sum += copyOfTheMatrix[i][j + 1];
                    }

                    matrix[i][j] = sum;
                }
            }
        }
    }

    public static void printTheMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
