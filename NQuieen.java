import java.util.ArrayList;
import java.util.List;

public class NQuieen {

    public static boolean isSafe(int row,int col,char[][] board) {
        for(int j=0;j< board.length;j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }
        for(int i=0;i< board.length;i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        int r = row;
        for(int c=0;c>=0 && r>0;c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c=col;c>=0 && r<board.length;r++,c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c=col;c>=0 && r< board.length;r++,c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        for(int c=col;c<board.length && r<board.length;c++,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board,List<List<String>> allboard) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++) {
            row = "";
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allboard.add(newBoard);
    }

    public static void helper(char[][] board,List<List<String>> allboard,int col) {

        if(col == board.length) {
            saveBoard(board,allboard);
            return;
        }

        for(int row=0;row<board.length;row++) {
            if(isSafe(row,col,board)) {
                board[row][col] = 'Q';
                helper(board,allboard,col+1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNqueen(int n) {
        List<List<String>> allboard = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board,allboard,0);
        return allboard;
    }

    public static void main(String[] args) {

        System.out.println(solveNqueen(4));
    }
}
