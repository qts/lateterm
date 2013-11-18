package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBoard
{
	Board myBoard = new Board();

	@Test
	public void testIsBoardEmpty()
	{
		assertEquals(true, myBoard.isEmpty());
	}

	@Test
	public void testIsBoardEmptyAfterUpdate()
	{
		myBoard.updateBoard(1, 'x');
		assertEquals(false, myBoard.isEmpty());
	}

	@Test
	public void testIsSpaceTakenWhenTheBoardIsSupposetlyEmpty()
	{
		assertEquals(false, myBoard.isSpaceTaken(2));
	}

	@Test 
	public void testIsSpaceTakenAfterUpdateBoard()
	{
		myBoard.updateBoard(3, 'B');
		assertEquals(true, myBoard.isSpaceTaken(3));
	}

	@Test
	public void testIfUpdateBoardInsertsWhenItShouldnt()
	{
		myBoard.updateBoard(1337, 'X');
		assertEquals(true, myBoard.isEmpty());
	}

	@Test
	public void testIfUpdateBoardInsertsWhenItShouldnt2()
	{
		myBoard.updateBoard( (-1337) , 'O');
		assertEquals(true, myBoard.isEmpty());
	}

	@Test
	public void testFullDR_357() //DR = Down Right \
	{
		myBoard.updateBoard(1, 'X');
		myBoard.updateBoard(2, 'X');
		myBoard.updateBoard(3, 'O');
		myBoard.updateBoard(4, 'X');
		myBoard.updateBoard(5, 'O');
		myBoard.updateBoard(6, 'X');
		myBoard.updateBoard(7, 'O');
		myBoard.updateBoard(8, 'O');
		myBoard.updateBoard(9, 'X');
		assertEquals(2, myBoard.isWinner());
	}

	@Test
	public void testRow_123()
	{
		myBoard.updateBoard(1, 'X');
		myBoard.updateBoard(2, 'X');
		myBoard.updateBoard(3, 'X');
		assertEquals(1, myBoard.isWinner());
	}

		@Test
	public void testCol_369()
	{
		myBoard.updateBoard(3, 'X');
		myBoard.updateBoard(6, 'X');
		myBoard.updateBoard(9, 'X');
		assertEquals(1, myBoard.isWinner());
	}

	@Test
	public void testDL_159() //DL = Down left /
	{
		myBoard.updateBoard(1, 'O');
		myBoard.updateBoard(5, 'O');
		myBoard.updateBoard(9, 'O');
		assertEquals(2, myBoard.isWinner());
	}

	@Test
	public void testDR_357() //DR = Down right \
	{
		myBoard.updateBoard(3, 'X');
		myBoard.updateBoard(5, 'X');
		myBoard.updateBoard(7, 'X');
		assertEquals(1, myBoard.isWinner());
	}

	@Test
	public void testError1()
	{
		myBoard.updateBoard(1, 'X');
		myBoard.updateBoard(2, 'o');
		myBoard.updateBoard(3, 'X');
		assertEquals(3, myBoard.isWinner());
	}

	@Test
	public void testError2()
	{
		myBoard.updateBoard(1, 'X');
		myBoard.updateBoard(2, 'x');
		myBoard.updateBoard(3, 'X');
		assertEquals(3, myBoard.isWinner());
	}

	@Test
	public void testError3()
	{
		myBoard.updateBoard(1, 'O');
		myBoard.updateBoard(1, 'X');
		myBoard.updateBoard(5, 'X');
		myBoard.updateBoard(5, 'O');
		myBoard.updateBoard(9, 'X');
		assertEquals(3, myBoard.isWinner());
	}

}