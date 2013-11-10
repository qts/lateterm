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
<<<<<<< HEAD
        //public static int add (String test){
         //       return 1;
        //}
}
=======
}
>>>>>>> 3cf3ea1333be3de83a50df96da2c147437c66f56
