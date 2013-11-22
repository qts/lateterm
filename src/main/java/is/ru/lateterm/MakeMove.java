package is.ru.lateterm;

import java.util.Scanner;
import java.util.Random;

public class MakeMove {
		Board board = new Board();
		
        /*public boolean wrongInput(int a, boolean right_input) {

             if(!a.hasNextInt()) {
                      System.out.print("Vitlaust slegid inn, reyndu aftur: ");
                          right_input = false;
                          return false;
                  }
                  return true;
         }*/

        public boolean outOfRange(int a){

                    if (a < 1 || a > 9) 
                        return true;       
                    else
                    	return false;
        }
        
        public int humanPlays(){
            Scanner input = new Scanner(System.in);
			      int block = 0;
            if(input.hasNextInt() ){
                block = input.nextInt();
              }
            else{
                block = 0;
                }	
			      return block;
        }
        
        
        public int computerPlays(){
        	Random ran = new Random();
        	int a = ran.nextInt(9) + 1;
        	return a;
        }
}