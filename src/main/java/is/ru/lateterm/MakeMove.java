package is.ru.lateterm;

import java.util.Scanner;
import java.util.Random;

public class MakeMove 
{
		Board board = new Board();

        public boolean outOfRange(int a)
        {

                    if (a < 1 || a > 9) 
                        return true;       
                    else
                    	return false;
        }
        
        
        public int computerPlays()
        {
        	Random ran = new Random();
        	int a = ran.nextInt(9) + 1;
        	return a;
        }
}