package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TurnTest 
{
        // Til ad vera alveg safe geri eg nokkur tilvik af turn.
        Turn testTurn = new Turn();
        Turn testTurn2 = new Turn();
        Turn testTurn3 = new Turn();

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
                assertEquals(true, testTurn2.whoseTurn());
        }

        @Test
        public void computerTurnCheck()
        {
                testTurn2.incrementTurn();
                assertEquals(false, testTurn2.whoseTurn());
        }

        @Test
        public void kastaYfirMarkid()
        {
                for (int i=0; i<11; i++)
                {
                        testTurn3.incrementTurn();
                }

                assertEquals(true, testTurn3.whoseTurn());
        }
}
