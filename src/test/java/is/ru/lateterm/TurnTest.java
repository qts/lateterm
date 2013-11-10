package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TurnTest {

        @Test
        public void WhoseTurnTest() {
                assertEquals(1, Turn.WhoseTurn(5)); 
        }       //If odd no, returns players turn
        @Test
        public void WhoseTurnTest2() {
                assertEquals(0, Turn.WhoseTurn(8));
        }       //If even no, returns computers turn
        @Test
        public void WhoseTurnTest3() {
                assertEquals(2, Turn.WhoseTurn(0));
        }       //If turn no. 0, game hasnt started, returns some error
        @Test
        public void WhoseTurnTest4() {
                assertEquals(2, Turn.WhoseTurn(10));
        }       //If turn no. 10, game his finished, returns some error
        @Test
        public void WhoseTurnTest5() {
                assertEquals(1, Turn.WhoseTurn(9));
        }       //If turn no. 9, game is ending, returns players turn
        @Test
        public void WhoseTurnTest6() {
                assertEquals(1, Turn.WhoseTurn(1));
        }       //If turn no. 1, game is starting, returns computers turn

        @Test
        public void UserPicksTest() {
                assertEquals('X', Turn.UserPicks(1));
        }       //If user picks somewhere between 1-9, returns 'X'
        @Test
        public void UserPicksTest2() {
                assertEquals('\0', Turn.UserPicks(0));
        }        //else returns empty char '\0'
        @Test
        public void UserPicksTest3() {
                assertEquals('\0', Turn.UserPicks(10));
        }       //same as 
        @Test
        public void UserPicksTest4() {
                assertEquals('X', Turn.UserPicks(9));
        }

}
