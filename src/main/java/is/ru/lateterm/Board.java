package is.ru.lateterm;

public class Board
{
	static char board[]; 
    static int max_turns;
    static int turn_counter;

    // turn_counter verður inni í main, printboard þarf að taka það inn, og max_turns

    // Constructor that initializes the board
    public Board()
    {
    	max_turns = 9;
    	turn_counter = 0;
    	board = new char[10];

    	for (int i = 0; i < 10; i++)
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
}

// GERA UPDATEBOARD........!