package is.ru.lateterm;

public class Turn {
        
        public static int WhoseTurn (int turn_counter)
        {
        	if (turn_counter >= 1 && turn_counter <= 9){
        		if(turn_counter % 2 == 0)
       			{
        			return 1; //Player turn
        		}
        		else
        		{
        			return 0; //Computer turn
        		}
        	}
        	else
        	{
        		return 2; //Error message / Error state
        	}
        }

        public static char UserPicks (int block_number)
        {
            if (block_number >= 1 && block_number <= 9){
                return 'X';
            }
            else
            {
                return '\0';
            }
        }
}
