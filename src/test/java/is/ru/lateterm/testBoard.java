package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testBoard
{
	@Test
	public void testNewBoard()
	{
		assertEquals(0, Board.newBoard());
	}
}