package is.ru.lateterm;

public class Board
{
	static char board[]; 
    Turn newTurn = new Turn(); // should this be here?..

    // Constructor that initializes the board
    public Board()
    {
    	board = new char[10];

    	for (int i = 0; i < newTurn.maxTurns + 1; i++)
    	{
    		board[i] = 0;
    	}
    }

    // Checks is the board is in fact empty
    public static boolean isEmpty()
    {
    	for (int i = 0; i < 10; i++)
    	{
    		if (board[i] != 0)
    		{
    			return false;
    		}
    	}
    	return true;
    }

    public static boolean isSpaceTaken(int placement)
    {
        return (board[placement-1] != 0);
    }
    

    public static void updateBoard(int placement, char playersSymbol)
    {
        if (placement >= 1 && placement <= 9)
        {
            if (isSpaceTaken(placement) == false)
            {
                board[placement-1] = playersSymbol;
            }
            else
            {
                System.out.print("This space is taken. ");
            }
        }
        else
        {
            System.out.print("Invalid move. ");
        }
    }

    /*
    public static void PrintZeBoard()
    {
        System.out.println("");

        int theTurn = newTurn.getCurrentTurn();
        int theMaxTurns = newTurn.getMaxTurns();

        boolean whoPlaysNext = newTurn.whoseTurn();

        System.out.println(theTurn + ". umferd");

        int col = 0;

        for (int j = 1; j <= theMaxTurns; j++) 
        {
            if (board[j] == '\0') 
            {
                System.out.print("   ");
                col++;
            } 
            else 
            {
                System.out.print(" " + board[j] + " ");
                col++;
            }
            if (col == 3 || col == 6 || col == 9)
                System.out.println("");
            else
                System.out.print("|");
        }
    }*/
}

// GERA UPDATEBOARD........!