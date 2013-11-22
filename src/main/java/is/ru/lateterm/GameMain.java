package is.ru.lateterm;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.lang.System.*;

import static spark.Spark.*;
import spark.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GameMain {

	public static void main(String [] args) {

		char ans;

		do{
			boolean right_input = false;

			Turn turn = new Turn();
			Board board = new Board();
			MakeMove makeMove = new MakeMove();

			System.out.println("<html><head><title>A game of TicTacToe</html></head></title>");

			System.out.println(" 1 | 2 | 3 ");
			System.out.write("<td><button style=\"border: none; padding: 0 0 0 0\"  type=\"button\">"+
		    "<img src=\"http://www.brics.dk/ixwt/X.gif\" alt=\"X\"></button></td>");
			System.out.println(" 4 | 5 | 6 ");
			System.out.println(" 7 | 8 | 9 ");


			while(turn.getCurrentTurn() <= turn.getMaxTurns())
			{
				if(turn.whoseTurn() == 1)
				{            	
					right_input = false;

					while (right_input == false) {
						System.out.println("Please choose a block");
						int hPlacement = 0;
						try{
							hPlacement = makeMove.humanPlays();
						}
						catch(InputMismatchException exc) {
							System.out.println("Not a number, try again.");
									right_input = false;
									break;   	                	
						}
						if(makeMove.outOfRange(hPlacement) == true)
						{    	                	
							right_input = false;
							System.out.println("Not a valid number, try again.");
							break;


						}
						if(board.isSpaceTaken(hPlacement) == true)
						{
							right_input = false;
							System.out.println("Space take, try again.");
						}
						else
						{
							board.updateBoard(hPlacement, 'X');
							turn.incrementTurn();
							right_input = true;
						}

					}
				}

				else if(turn.whoseTurn() == 2)
				{
					right_input = false;

					while (right_input == false) {
						int cPlacement = makeMove.computerPlays();
						if(board.isSpaceTaken(5) != true) //reynir ad setja i midjuna i byrjun.
						{
							board.updateBoard(5, 'O');
							turn.incrementTurn();
							right_input = true;
						}
						else if(board.isSpaceTaken(cPlacement) != true)
						{
							board.updateBoard(cPlacement, 'O');
							turn.incrementTurn();
							right_input = true;				
						}
					}
				}
				if(board.isWinner() == 1)
				{
					System.out.println("Congratulations! You won!");
					break;

				}
				else if(board.isWinner() == 2)
				{
					System.out.println("The computer is the winner, better luck next time.");
					break;

				}
				else if(turn.getCurrentTurn() == turn.getMaxTurns()+1)
				{
					System.out.println("A tie!");
					break;
				}

			}
			System.out.println("Play again? Y/N");
			Scanner reader = new Scanner(System.in);
			ans = reader.next().charAt(0);
		}while(ans == 'Y' || ans == 'y');
		System.out.println("Game over!");



	}
}
