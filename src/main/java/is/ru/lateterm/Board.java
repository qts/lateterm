package is.ru.lateterm;

public class Board
{
    char board[]; 
    Turn newTurn;
    MakeMove makeMove;

    // Constructor that initializes the board
    public Board()
    {
        board = new char[9];

        for (int i = 0; i < 9 ; i++)
        {
            board[i] = 0;
        }

        newTurn = new Turn();
    }

    // Checks is the board is in fact empty
    public boolean isEmpty()
    {
        for (int i = 0; i < 9; i++)
        {
            if (board[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean isSpaceTaken(int placement)
    {
        if (board[placement-1] != 0)
            return true;                
        else
            return false;
        // Check that its NOT empty
    }
    

    public void updateBoard(int placement, char playersSymbol)
    {
        int theTurn = newTurn.getCurrentTurn();
        int theMaxTurns = newTurn.getMaxTurns();
        
        if (placement >= 1 && placement <= 9){
        board[placement-1] = playersSymbol;
        newTurn.incrementTurn();
        
        PrintZeBoard(theTurn, theMaxTurns);
        }
    }

    public int isWinner()
    {
        for (int n = 0; n < 9; n = n+3) 
        {    // 1, 2, 3 - 4, 5, 6 - 7, 8, 9               
            if (board[n] != 0 && board[n] == board[n + 1] && board[n + 1] == board[n + 1 + 1]) 
            {
                if (board[n] == 'X')
                    return 1; //Player wins
                else if (board[n] == 'O')
                    return 2; // Computer wins                   
            }
        }

        for (int n = 0; n < 3; n++) 
        {   // 1, 4, 7 - 2, 5, 8 - 3, 6, 9
            if (board[n] != 0 && board[n] == board[n + 3] && board[n + 3] == board[n + 3 + 3]) 
            {
                if (board[n] == 'X')
                    return 1; //Player wins
                else if (board[n] == 'O')
                    return 2; // Computer wins                                           
            }
        }


        if (board[0] != 0 && board[0] == board[4] && board[4] == board[8]) 
        {
                if (board[0] == 'X')
                    return 1; //Player wins
                else if (board[0] == 'O')
                    return 2; // Computer wins   
        }

        if (board[2] != 0 && board[2] == board[4] && board[4] == board[6]) 
        {
                if (board[2] == 'X')
                    return 1; //Player wins
                else if (board[2] == 'O')
                    return 2; // Computer wins   
        }

    return 3; //No winning combinations 
}

    
    public void PrintZeBoard(int theTurn, int maxTurns)
    {
        System.out.println("");

        //boolean whoPlaysNext = newTurn.whoseTurn();

        System.out.println(theTurn + ". round");

        int col = 0;

        for (int j = 0; j < maxTurns; j++) 
        {
            if (board[j] == '\0') 
            {
                System.out.print("   ");
                col++;
            } 
            else 
            {
                System.out.print(" " + board[j] + " ");
                col++;
            }
            if (col == 3 || col == 6 || col == 9)
                System.out.println("");
            else
                System.out.print("|");
        }
    }
}