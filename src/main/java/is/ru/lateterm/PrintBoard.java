package is.ru.lateterm;

public class PrintBoard
{

	public static String whichRound()
	{
		//String round = myBoard.turn_counter + 1;
		String round = "bla";
		return round;
	}

	public static void PrintZeBoard(Board myBoard)
	{
		System.out.println("");
		String zeRound = whichRound();

		System.out.println(zeRound + ". umferd");

	    if (myBoard.turn_counter % 2 == 1)
	    {
	    	System.out.println("Tolvan er ad gera");
	    }

	    int col = 0;

	    for (int j = 1; j <= myBoard.max_turns; j++) 
	    {
	        if (myBoard.board[j] == '\0') 
	        {
	            System.out.print("   ");
	            col++;
	        } 
	        else 
	        {
	            System.out.print(" " + myBoard.board[j] + " ");
	            col++;
	        }
	        if (col == 3 || col == 6 || col == 9)
	            System.out.println("");
	        else
	            System.out.print("|");
	    }

	}

}