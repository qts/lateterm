package is.ru.lateterm;


public class Turn 
{
    public int maxTurns;
    public int currentTurn;

    public Turn()
    {
        maxTurns = 9;
        currentTurn = 1;
    }
        
    public int whoseTurn()
    {
    	if (currentTurn >= 1 && currentTurn <= 9)
        {
    		if (currentTurn % 2 == 1)
   			{
    			return 1; //Player turn
    		}
    		else
    		{
    			return 2; //Computer turn
    		}
    	}
        else
        {
            return 3; // kasta villu?..
        }
    }

    public void incrementTurn()
    {
        currentTurn += 1;
    }

    public int getMaxTurns()
    {
        return maxTurns;
    }

    public int getCurrentTurn()
    {
        return currentTurn;
    }
}
