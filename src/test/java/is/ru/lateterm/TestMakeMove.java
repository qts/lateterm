package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
                assertEquals(false, testmove.outOfRange(vitlaust, false));
        }

        @Test
        public void testoutOfRange2()
        {
                int rett = 9;
                assertEquals(true, testmove.outOfRange(rett, false));
        }

}