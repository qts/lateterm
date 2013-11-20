package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;

public class TestMakeMove
{
        MakeMove testmove = new MakeMove();


        // @Test
        // public void testTaken()
        // {
        //         int rett = 2;
        //         assertEquals
        // }

        @Test
        public void testoutOfRange()
        {
                int vitlaust = 10;
                assertEquals(true, testmove.outOfRange(vitlaust));
        }

        @Test
        public void testoutOfRange2()
        {
                int rett = 9;
                assertEquals(false, testmove.outOfRange(rett));
        }

        //@Test
        //public void charInsteadOfInt()
        //{
                //ByteArrayInputStream test = new ByteArrayInputStream("2".getBytes());
                //System.setIn(test);
                //assertEquals(true, testmove.wrongInput(test, false));
        //}


}