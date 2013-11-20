package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TurnTest 
{
        Turn testTurn = new Turn();

        @Test
        public void constructorTest()
        {
                assertEquals(9, testTurn.maxTurns);
        }

        @Test
        public void constructorTest2()
        {
                assertEquals(1, testTurn.currentTurn);
        }

        @Test 
        public void incrementTurnTest()
        {
                testTurn.incrementTurn();
                assertEquals(2, testTurn.currentTurn);
        }

        @Test
        public void playerTurnCheck()
        {
                assertEquals(1, testTurn.whoseTurn());
        }

        @Test
        public void computerTurnCheck()
        {
                testTurn.incrementTurn();
                assertEquals(2, testTurn.whoseTurn());
        }

        @Test
        public void kastaYfirMarkid()
        {
                for (int i=0; i<11; i++)
                {
                        testTurn.incrementTurn();
                }

                assertEquals(3, testTurn.whoseTurn());
        }
}
