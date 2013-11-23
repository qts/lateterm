package is.ru.lateterm;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.System.*;

import static spark.Spark.*;
import spark.*;

public class GameMain {
	public static void main(String [] args) {
		char ans;
		/*
		 * do-while loop that continues until the player does not want
		 * to play anymore
		 */
		do {
			boolean rightInput = false;
			Turn turn = new Turn();
			Board board = new Board();
			MakeMove makeMove = new MakeMove();
			board.greet();

			/*
			 * Continues while the game is not finished
			 */
			while (turn.getCurrentTurn() <= turn.getMaxTurns()) {
				if (turn.whoseTurn() == 1) {
					rightInput = false;

					/*
					 * When the player chooses a wrong input
					 */
					while (rightInput == false) {
						System.out.println("Please choose a block");
						Scanner input;
						int hPlacement = 0;
						try {
							input = new Scanner(System.in);
							if (input.hasNextInt()) {
								hPlacement = input.nextInt();
							} else {
								hPlacement = 0;
							}
						} catch (InputMismatchException exc) {
							System.out.println("Not a number, try again.");
							rightInput = false;
							break;
						}
						if (makeMove.outOfRange(hPlacement) == true) {
							rightInput = false;
							System.out.println("Not a valid number, try again.");
							break;
						}
						if (board.isSpaceTaken(hPlacement) == true) {
							rightInput = false;
							System.out.println("Space take, try again.");
						} else {
							board.updateBoard(hPlacement, 'X');
							turn.incrementTurn();
							rightInput = true;
						}
					}
				} else if (turn.whoseTurn() == 2) {
					rightInput = false;

					while (rightInput == false) {
						int cPlacement = makeMove.computerPlays();
						if (board.isSpaceTaken(cPlacement) != true) {
							board.updateBoard(cPlacement, 'O');
							turn.incrementTurn();
							rightInput = true;
						}
					}
				}
				if (board.isWinner() == 1) {
					System.out.println("Congratulations! You won!");
					break;
				} else if (board.isWinner() == 2) {
					System.out.println("The computer is the winner, better luck next time.");
					break;
				} else if (turn.getCurrentTurn() == turn.getMaxTurns() + 1) {
					System.out.println("A tie!");
					break;
				}
			}
			System.out.println("Play again? Y/N");
			Scanner reader = new Scanner(System.in);
			ans = reader.next().charAt(0);
		} while(ans == 'Y' || ans == 'y');
		System.out.println("Game over!");
	}
}
