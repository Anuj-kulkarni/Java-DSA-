public class pratice {

    public static boolean safequeen(char board[][], int row, int col){
        // vertical up direction
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // left diagonal up direction
        for(int i=row-1, j=col-1; i>=board.length && j>=board.length; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }


        // right diagonal up direction
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void chessboard(char board[][], int row){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+"");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nQueens(char board[][], int row){
        // base case
        if(row == board.length){
            chessboard(board, row);// printing the chess board
            return;
        }

        // Kaam
        for(int j=row; j<board.length; j++){
            if(safequeen(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        // initialize the chess board
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
            System.out.println();
        }
        nQueens(board, 0);
    }
}
