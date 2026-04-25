import java.util.Scanner;

public class TicTacToeGame {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        showBoard();
    }

    /**
     * UC1: Display Empty Tic-Tac-Toe Board
     * Initializes the board with '-' to indicate empty cells.
     */
    public static void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * Prints the current state of the board to the console.
     */
    public static void showBoard() {
        System.out.println("\nCurrent Board Layout:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
