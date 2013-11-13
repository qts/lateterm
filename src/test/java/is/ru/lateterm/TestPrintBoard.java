package is.ru.lateterm;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPrintBoard
{
	/*@Test
	public void testPrintB()
	{
		assertEquals(0, PrintBoard.PrintZeBoard());
	}*/

	@Test
	public void testRound1()
	{
		//assertEquals(PrintBoard.printWhichRound.round);
		assertEquals("bla", PrintBoard.whichRound());
	}
}