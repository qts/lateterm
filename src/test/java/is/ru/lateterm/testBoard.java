package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBoard
{
	@Test
	public void testIsBoardEmpty()
	{
		assertEquals(true, Board.isEmpty());
	}

	@Test
	public void testIsTurnCounterZero()
	{
		assertEquals(0, Board.turn_counter);
	}

	@Test
	public void testIsMaxTurnsNine() 
	{
		assertEquals(9, Board.max_turns); // durkherp
	}
}