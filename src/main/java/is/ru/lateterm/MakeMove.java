package is.ru.lateterm;

import java.util.Random;

public class MakeMove {
    Board board = new Board();

    /*
     * Return true if input is not from 1-9
     */
    public boolean outOfRange(int a) {
        if (a < 1 || a > 9) {
            return true;
        }
        return false;
    }

    /*
     * The computer placement is chosen at random???
     */
    public int computerPlays() {
        Random ran = new Random();
        int a = ran.nextInt(9) + 1;
        return a;
    }
}
