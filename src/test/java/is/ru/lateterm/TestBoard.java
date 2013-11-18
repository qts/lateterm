package is.ru.lateterm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

//Inga hatar taco

public class TestBoard
{
	Board myBoard = new Board();
	Board myBoard2 = new Board();
	Board myBoard3 = new Board();
	Board myBoard4 = new Board();
	Board myBoard5 = new Board();
	Board myBoard6 = new Board();
	Board myBoard7 = new Board();
	Board myBoard8 = new Board();

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
		assertEquals(false, myBoard2.isSpaceTaken(2));
	}

	@Test 
	public void testIsSpaceTakenAfterUpdateBoard()
	{
		myBoard2.updateBoard(3, 'B');
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

	@Test
	public void test1rowxxx()
	{
		myBoard6.updateBoard(1, 'X');
		myBoard6.updateBoard(2, 'X');
		myBoard6.updateBoard(3, 'X');
		assertEquals(1, myBoard6.isWinner());
	}

	@Test
	public void test1rowxox()
	{
		myBoard7.updateBoard(1, 'X');
		myBoard7.updateBoard(2, 'o');
		myBoard7.updateBoard(3, 'X');
		assertEquals(3, myBoard7.isWinner());
	}

	@Test
	public void test1blaannad()
	{
		myBoard8.updateBoard(1, 'X');
		myBoard8.updateBoard(2, 'X');
		myBoard8.updateBoard(3, 'O');
		myBoard8.updateBoard(4, 'X');
		myBoard8.updateBoard(5, 'O');
		myBoard8.updateBoard(6, 'X');
		myBoard8.updateBoard(7, 'O');
		myBoard8.updateBoard(8, 'O');
		myBoard8.updateBoard(9, 'X');
		assertEquals(2, myBoard8.isWinner());
	}

}
