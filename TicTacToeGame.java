import java.util.Scanner;

public class TicTacToeGame {
    static char[][] board = new char[3][3];

    static char playerSymbol, computerSymbol;
    static int currentPlayer; // 1 for Player, 2 for Computer

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        tossToStart();
        showBoard();
        int slot = getUserInput();
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        System.out.println("Selected Slot: " + slot + " -> Index: (" + row + ", " + col + ")");
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
    /**
     * UC2: Toss to Decide First Player and Symbol
     * Randomly decides which player starts and assigns symbols.
     */
    public static void tossToStart() {
        int toss = (int) (Math.random() * 2); // 0 or 1
        if (toss == 0) {
            System.out.println("Toss Result: Player starts first!");
            currentPlayer = 1;
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            System.out.println("Toss Result: Computer starts first!");
            currentPlayer = 2;
            playerSymbol = 'O';
            computerSymbol = 'X';
        }
        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    /**
     * UC3: Accept User Slot Input (1–9)
     * Reads a slot number from the user.
     */
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your move (1-9): ");
        return sc.nextInt();
    }
}
