package is.ru.lateterm;
 
public class Turn {
    public int maxTurns;
    public int currentTurn;
 
    /*
     * Constructor that initializes maxTurns and currentTurn
     */
    public Turn() {
        maxTurns = 9;
        currentTurn = 1;
    }
 
    /*
     * return 1 if player turn, return 2 if computer turn, the player
     * always begins
     */
    public int whoseTurn() {
        if (currentTurn >= 1 && currentTurn <= 9) {
                if (currentTurn % 2 == 1) {
                        return 1;
                } else {
                        return 2;
                }
        } else {
            return 3;
        }
    }
 
    /*
     * Adds 1 to currentTurn?????? - þarf þetta komment að vera?
     */
    public void incrementTurn() {
        currentTurn += 1;
    }
 
    public int getMaxTurns() {
        return maxTurns;
    }
 
    public int getCurrentTurn() {
        return currentTurn;
    }
}