package is.ru.lateterm;

public class Turn 
{
    static int maxTurns;
    static int currentTurn;

    public Turn()
    {
        maxTurns = 9;
        currentTurn = 1;
    }
        
    public static boolean whoseTurn()
    {
    	if (currentTurn >= 1 && currentTurn <= 9)
        {
    		if (currentTurn % 2 == 0)
   			{
    			return false; //Computer turn
    		}
    		else
    		{
    			return true; //Player turn
    		}
    	}
        else
        {
            return true; // kasta villu?..
        }
    }

    public static void incrementTurn()
    {
        currentTurn += 1;
    }

    public static int getMaxTurns()
    {
        return maxTurns;
    }

    public static int getCurrentTurn()
    {
        return currentTurn;
    }
}
