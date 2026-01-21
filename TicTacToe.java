import java.util.Scanner;
/*
 * TicTacToe
 * ----------
 * A command-line based Tic Tac Toe game for two players.
 * Player 1 uses 'X' and Player 2 uses 'O'.
 * Players take turns to mark cells on a 3x3 grid.
 */
class TicTacToe {
    // 3x3 character array to represent the game board
    char[][] board;
    // Stores the current player's symbol ('X' or 'O')
    char currentPlayer;
    // Constructor: initializes the board and sets first player
    TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
   // Initializes the board with empty spaces
    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    // Displays the current state of the board
    void displayBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }
    // Checks whether the move entered by the player is valid
    boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }
    // Places the current player's symbol on the board
    void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }
    // Switches turn between Player X and Player O
    void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    // Checks whether the current player has won the game
    boolean hasWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;

            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true;
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true;
       return false;
    }
    // Checks if the game ends in a draw
    boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
    // Main method: controls game flow and user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain;
    // Instructions for players
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("How to Play:");
        System.out.println("1. The game is played on a 3x3 grid.");
        System.out.println("2. Player X goes first, followed by Player O.");
        System.out.println("3. Enter row and column numbers between 0 and 2.");
        System.out.println("4. Example input: 1 2 (row 1, column 2)");
        System.out.println("5. The first player to get three marks in a row wins.\n");

        do {
            TicTacToe game = new TicTacToe();
            boolean gameOver = false;

            while (!gameOver) {
                game.displayBoard();
                System.out.println("\nPlayer " + game.currentPlayer +", enter your move (row column):");

                int row = sc.nextInt();
                int col = sc.nextInt();

                if (game.isValidMove(row, col)) {
                    game.makeMove(row, col);

                    if (game.hasWinner()) {
                        game.displayBoard();
                        System.out.println("\nPlayer " + game.currentPlayer + " wins!");
                        gameOver = true;
                    } else if (game.isDraw()) {
                        game.displayBoard();
                        System.out.println("\nThe game is a draw.");
                        gameOver = true;
                    } else {
                        game.switchPlayer();
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
         // Ask players if they want to play again
            System.out.println("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().equalsIgnoreCase("y");

        } while (playAgain);

        System.out.println("\nThanks for playing Tic Tac Toe.");
        sc.close();
    }
}
