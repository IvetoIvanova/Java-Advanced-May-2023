package F02MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }

        char fillChar = scanner.next().charAt(0);
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();

        char startChar = matrix[startRow][startCol];
        fillMatrix(matrix, startRow, startCol, startChar, fillChar);

        printMatrix(matrix);
    }

    private static void fillMatrix(char[][] matrix, int startRow, int startCol, char startChar, char fillChar) {
        if (startRow < 0
                || startRow >= matrix.length
                || startCol < 0
                || startCol >= matrix[0].length
                || matrix[startRow][startCol] != startChar) {
            return;
        }

        matrix[startRow][startCol] = fillChar;

        fillMatrix(matrix, startRow - 1, startCol, startChar, fillChar); // Up
        fillMatrix(matrix, startRow + 1, startCol, startChar, fillChar); // Down
        fillMatrix(matrix, startRow, startCol - 1, startChar, fillChar); // Left
        fillMatrix(matrix, startRow, startCol + 1, startChar, fillChar); // Right
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
