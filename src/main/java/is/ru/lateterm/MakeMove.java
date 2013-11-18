package is.ru.lateterm;


public class MakeMove {


        //  public boolean wrongInput(a, right_input) {

        //      if(!a.hasNextInt()) {
        //              System.out.print("Vitlaust slegid inn, reyndu aftur: ");
        //                  right_input = false;
        //                  return false;
        //          }
        //          return true;
        // }

        public boolean outOfRange(int a, boolean right_input){

                    if (a < 0 || a > 9) {
                            System.out.print("Talan sem thu slost inn er ekki rett, reyndu aftur, ");
                            right_input = false;
                            return false;
                    } 
                    return true;
        }

        // public boolean taken(int a, boolean right_input, Board board){

        //         if (board.isSpaceTaken(a)) {
        //                 System.out.println("Upptekinn reitur, reyndu aftur:");
        //                 right_input = false;
        //         } 
        //         return true;
        // }

        // public boolean insert(a, right_input){

        //         board.updateBoard(a, player);
        //         right_input = true;
        // }
            


        //  public boolean computerPlays(right_input){

        //      while (right_input == false) {
        //              Random ran = new Random();
        //              int a = ran.nextInt(9) + 1;

        //              if (board[a] != '\0') {
        //                      right_input = false;
        //              } else {
        //                      board[a] = computer;
        //                      right_input = true;
        //              }
        // }
}