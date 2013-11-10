package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TurnTest {

        @Test
        public void WhoseTurnTest() {
                assertEquals(1, Turn.WhoseTurn(5));
        }
        
        @Test
        public void WhoseTurnTest2() {
                assertEquals(0, Turn.WhoseTurn(8));
        }
        @Test
        public void WhoseTurnTest3() {
                assertEquals(2, Turn.WhoseTurn(0));
        }
        @Test
        public void WhoseTurnTest4() {
                assertEquals(2, Turn.WhoseTurn(10));
        }
        @Test
        public void WhoseTurnTest5() {
                assertEquals(1, Turn.WhoseTurn(9));
        }
        @Test
        public void WhoseTurnTest6() {
                assertEquals(1, Turn.WhoseTurn(1));
        }
}
