package is.ru.lateterm;

public class Board {
    char[] board;
    Turn newTurn;
    MakeMove makeMove;

    /*
     * Constructor that initializes the board
     */
    public Board() {
        board = new char[9];

        for (int i = 0; i < 9; i++) {
            board[i] = 0;
        }
        newTurn = new Turn();
    }

    /*
     * Prints out a greeting
     */
    public void greet() {
        System.out.println("A game of TicTacToe");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println(" 7 | 8 | 9 ");
    }

    /*
     * Returns true if the board is empty
     */
    public boolean isEmpty() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Returns true if a specific space is taken
     */
    public boolean isSpaceTaken(int placement) {
        if (board[placement - 1] != 0) {
            return true;
        }
        return false;
    }

    /*
     * Checks if the block chosen is available then takes in the
     * variable placement and symbol, updates the board with the
     * new information - betra ord and prints the new board
     */
    public void updateBoard(int placement, char playersSymbol) {
        int theTurn = newTurn.getCurrentTurn();
        int theMaxTurns = newTurn.getMaxTurns();

        if (placement >= 1 && placement <= 9) {
            board[placement - 1] = playersSymbol;
            newTurn.incrementTurn();
            printZeBoard(theTurn, theMaxTurns);
        }
    }

    /*
     * Checks who is the winner by comparing blocks and symbols on
     * the board returns 1 if the human player wins, 2 if the
     * computer wins and 3 if it is a tie
     */
    public int isWinner() {
        for (int n = 0; n < 9; n = n + 3) {
            if (board[n] != 0 && board[n] == board[n + 1]
                    && board[n + 1] == board[n + 1 + 1]) {
                if (board[n] == 'X') {
                    return 1;
                } else if (board[n] == 'O') {
                    return 2;
                }
            }
        }
        for (int n = 0; n < 3; n++) {
            if (board[n] != 0 && board[n] == board[n + 3]
                    && board[n + 3] == board[n + 3 + 3]) {
                if (board[n] == 'X') {
                    return 1;
                } else if (board[n] == 'O') {
                    return 2;
                }
            }
        }
        if (board[0] != 0 && board[0] == board[4] && board[4] == board[8]) {
            if (board[0] == 'X') {
                return 1;
            } else if (board[0] == 'O') {
                return 2;
            }
        }
        if (board[2] != 0 && board[2] == board[4] && board[4] == board[6]) {
            if (board[2] == 'X') {
                return 1;
            } else if (board[2] == 'O') {
                return 2;
            }
        }
        return 3;
    }

    /*
     * Prints the board
     */
    public void printZeBoard(int theTurn, int maxTurns) {
        System.out.println("");
        System.out.println(theTurn + ". round");

        int col = 0;

        for (int j = 0; j < maxTurns; j++) {
            if (board[j] == '\0') {
                System.out.print("   ");
                col++;
            } else {
                System.out.print(" " + board[j] + " ");
                col++;
            }
            if (col == 3 || col == 6 || col == 9) {
                System.out.println("");
            } else {
                System.out.print("|");
            }
        }
    }
}
