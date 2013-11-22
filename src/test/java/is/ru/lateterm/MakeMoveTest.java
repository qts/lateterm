package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;

public class MakeMoveTest
{
        MakeMove testmove = new MakeMove();

        @Test
        public void testoutOfRange()
        {
                int tooBig = 10;
                assertEquals(true, testmove.outOfRange(tooBig));
        }

        @Test
        public void testoutOfRange2()
        {
                int justRight = 9;
                assertEquals(false, testmove.outOfRange(justRight));
        }

        @Test
        public void testoutOfRange3()
        {
                int tooSmall = -1337;
                assertEquals(true, testmove.outOfRange(tooSmall));
        }

        @Test
        public void testcomputerPlays()
        {
                assertEquals(true, testmove.computerPlays() < 10 && testmove.computerPlays() > 0);
        }
}