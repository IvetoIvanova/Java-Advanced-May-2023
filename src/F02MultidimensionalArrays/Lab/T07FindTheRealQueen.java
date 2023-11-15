package F02MultidimensionalArrays.Lab;

import java.util.Scanner;

public class T07FindTheRealQueen {
    public static void main(String[] args) {

        char[][] chessboard = readChessboard();
        int[] queenPosition = findValidQueenPosition(chessboard);

        if (queenPosition != null) {
            System.out.println(queenPosition[0] + " " + queenPosition[1]);
        }
    }

    private static char[][] readChessboard() {
        Scanner scanner = new Scanner(System.in);
        char[][] chessboard = new char[8][8];

        for (int row = 0; row < 8; row++) {
            char[] array = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            chessboard[row] = array;
        }
        return chessboard;
    }

    private static int[] findValidQueenPosition(char[][] chessboard) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessboard[i][j] == 'q' && isValidQueenPosition(chessboard, i, j)) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    private static boolean isValidQueenPosition(char[][] chessboard, int row, int col) {
        for (int i = 0; i < 8; i++) {
            if ((chessboard[row][i] == 'q' && i != col) || (chessboard[i][col] == 'q' && i != row)) {
                return false;
            }
        }

        for (int i = 1; i < 8; i++) {
            if ((row - i >= 0 && col - i >= 0 && chessboard[row - i][col - i] == 'q') ||
                    (row - i >= 0 && col + i < 8 && chessboard[row - i][col + i] == 'q') ||
                    (row + i < 8 && col - i >= 0 && chessboard[row + i][col - i] == 'q') ||
                    (row + i < 8 && col + i < 8 && chessboard[row + i][col + i] == 'q')) {
                return false;
            }
        }

        return true;
    }
}