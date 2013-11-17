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
        
    public boolean whoseTurn()
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
