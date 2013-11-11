package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CheckWinTest {

        @Test
        public void CheckWinTest11() {
                assertEquals(1, CheckWin.Line(1, 2, 3, 4, 5)); // 1, 2, 3
        } 
        @Test
        public void CheckWinTest12() {
                assertEquals(1, CheckWin.Line(1, 4, 5, 6, 9)); //4, 5, 6
        } 
        @Test
        public void CheckWinTest13() {
                assertEquals(1, CheckWin.Line(2, 5, 7, 8, 9)); //7, 8, 9
        }
        @Test
        public void CheckWinTest21() {
                assertEquals(1, CheckWin.Line(1, 4, 5, 7, 9)); //1, 4, 7
        }  
        @Test
        public void CheckWinTest22() {
                assertEquals(1, CheckWin.Line(2, 5, 6, 8, 9)); // 2, 5, 8
        }  
        @Test
        public void CheckWinTest23() {
                assertEquals(1, CheckWin.Line(2, 3, 6, 7, 9)); //3, 6, 9
        }
        @Test
        public void CheckWinTest31() {
                assertEquals(1, CheckWin.Line(1, 3, 5, 6, 9)); //1, 5, 9
        } 
        @Test
        public void CheckWinTest41() {
                assertEquals(1, CheckWin.Line(1, 3, 5, 7, 8)); //3, 5, 7
        }
        //NO WIN TESTS

        /*      F1      F2      F3      F4
                X-X     -XX     -X-     X--
                --X     XX-     X-X     X-X
                XX-     --X     X-X     -XX
        */

        @Test
        public void CheckWinTestF1() {                                          
               assertEquals(4, CheckWin.Line(1, 3, 6, 7, 8));
        } 
                @Test
        public void CheckWinTestF2() {                                          
               assertEquals(4, CheckWin.Line(2, 3, 4, 5, 9));
        } 
                @Test
        public void CheckWinTestF3() {                                          
               assertEquals(4, CheckWin.Line(2, 4, 6, 7, 9));
        } 
                @Test
        public void CheckWinTestF4() {                                          
               assertEquals(4, CheckWin.Line(1, 4, 6, 8, 9));
        } 

}