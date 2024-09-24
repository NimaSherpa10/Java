package Object.QuestionNine;


public class TicTacToe {
    private char[][] board; 
    private int turns;    

   
    public TicTacToe() {
        board = new char[3][3]; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        turns = 0; 
    }

   
    public int numTurns() {
        return turns;
    }

    
    public char playerAt(int r, int c) {
        if (isValid(r, c)) {
            return board[r][c]; 
        }
        return ' ';
    }

    
    public boolean isWinner(char p) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == p && board[i][1] == p && board[i][2] == p) || 
                (board[0][i] == p && board[1][i] == p && board[2][i] == p)) { 
                return true;
            }
        }
      
        if ((board[0][0] == p && board[1][1] == p && board[2][2] == p) || 
            (board[0][2] == p && board[1][1] == p && board[2][0] == p)) { 
            return true;
        }
        return false; // No win
    }

    
    public boolean isFull() {
        return turns == 9; 
    }

   
    public boolean isCat() {
        return isFull() && !isWinner('X') && !isWinner('O'); 
    }

    
    public boolean isValid(int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' '; 
    }

    // Method to place a move on the board
    public void playMove(char p, int r, int c) {
        if (isValid(r, c)) {
            board[r][c] = p; 
            turns++; 
        } else {
            System.out.println("Invalid move. Try again."); 
        }
    }

   
    public void displayBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }
}