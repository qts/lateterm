package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBoard
{
	Board myBoard = new Board();
	Board myBoard2 = new Board();
	Board myBoard3 = new Board();
	Board myBoard4 = new Board();
	Board myBoard5 = new Board();

	@Test
	public void testIsBoardEmpty()
	{
		assertEquals(true, myBoard.isEmpty());
	}

	@Test
	public void testIsBoardEmptyAfterUpdate()
	{
		myBoard.updateBoard(1, 'O');
		assertEquals(false, myBoard.isEmpty());
	}

	@Test
	public void testIsSpaceTakenWhenTheBoardIsSupposetlyEmpty()
	{
		assertEquals(false, myBoard2.isSpaceTaken(2));
	}

	@Test 
	public void testIsSpaceTakenAfterUpdateBoard()
	{
		myBoard2.updateBoard(3, 'X');
		assertEquals(true, myBoard2.isSpaceTaken(3));
	}

	@Test
	public void testIfUpdateBoardInsertsWhenItShouldnt()
	{
		myBoard4.updateBoard(1337, 'X');
		assertEquals(true, myBoard4.isEmpty());
	}

	@Test
	public void testIfUpdateBoardInsertsWhenItShouldnt2()
	{
		myBoard5.updateBoard( (-1337) , 'O');
		assertEquals(true, myBoard5.isEmpty());
	}

}