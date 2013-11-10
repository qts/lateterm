package is.ru.lateterm;

public class Turn {
        
        public static int WhoseTurn (int turn_counter)
        {
        	if (turn_counter >= 1 && turn_counter <= 9){
        		if(turn_counter % 2 == 0)
       			{
        			return 0;
        		}
        		else
        		{
        			return 1;
        		}
        	}
        	else
        	{
        		return 2;
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
