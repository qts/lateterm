package is.ru.lateterm;

public class Board
{
	char board[]; 
    Turn newTurn; 

    // Constructor that initializes the board
    public Board()
    {
    	board = new char[9];

    	for (int i = 0; i < 9 ; i++) // LAGA!
    	{
    		board[i] = 0;
    	}

        newTurn = new Turn();

    }

    // Checks is the board is in fact empty
    public boolean isEmpty()
    {
    	for (int i = 0; i < 9; i++)
    	{
    		if (board[i] != 0)
    		{
    			return false;
    		}
    	}
    	return true;
    }

    public boolean isSpaceTaken(int placement)
    {
        return (board[placement-1] != 0);
        // ef þetta er indeed EKKI jafnt og 0 (semsagt 
    }
    

    public void updateBoard(int placement, char playersSymbol)
    {
        int theTurn = newTurn.currentTurn;
        int theMaxTurns = newTurn.maxTurns;

        if (placement >= 1 && placement <= 9)
        {
            if (isSpaceTaken(placement) == false)
            {
                board[placement-1] = playersSymbol;

                PrintZeBoard(theTurn, theMaxTurns);
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

    
    public void PrintZeBoard(int theTurn, int maxTurns)
    {
        System.out.println("");

        //boolean whoPlaysNext = newTurn.whoseTurn();

        System.out.println(theTurn + ". umferd");

        int col = 0;

        for (int j = 1; j <= maxTurns; j++) 
        {
            if (board[j-1] == '\0') 
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
    }
}

// GERA UPDATEBOARD........!