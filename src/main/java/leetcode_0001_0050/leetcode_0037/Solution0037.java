package leetcode_0001_0050.leetcode_0037;

public class Solution0037 {
    public void solveSudoku(char[][] board) {
        solveSudokuDFS(board, 0,0);
    }

    public boolean solve(char[][] board, int x, int y){
        if (x == 9 || y==9){
            return true;
        }
        if (board[x][y] == '.'){
            for (int i=0; i<9; i++){
                if (isValid(board, x, y, (char)('0'+i))){
                    board[x][y] = (char)('0'+i);
                    if (y < 8 ){
                        if (solve(board, x, y+1))
                            return true;
                    }
                    else {
                        if (solve(board, x+1, 0))
                            return true;
                    }
                    board[x][y] = '.';
                }
            }
            return false;
        }
        else {
            if (y < 8){
                return solve(board, x, y+1);
            }
            else {
                return solve(board, x+1, 0);
            }
        }
    }

    public boolean solveSudokuDFS(char[][] board, int i, int j) {
        if (i == 9) return true;
        if (j >= 9) return solveSudokuDFS(board, i + 1, 0);
        if (board[i][j] == '.') {
            for (int k = 1; k <= 9; ++k) {
                if (isValid(board, i , j, (char)(k + '0'))) {
                    board[i][j] = (char)(k + '0');
                    if (solveSudokuDFS(board, i, j + 1)) return true;
                }
                board[i][j] = '.';
            }
        } else {
            return solveSudokuDFS(board, i, j + 1);
        }
        return false;
    }

    public boolean isValid(char[][] board, int x, int y, char target){
        int x1, y1;
        for (int i=0; i<9; i++){
            if (board[x][i] == target){
                return false;
            }
            if (board[i][y] == target){
                return false;
            }
            x1 = x / 3 * 3 + i / 3;
            y1 = y / 3 * 3 + i % 3;
            if (board[x1][y1] == target){
                return false;
            }
        }
        return true;
    }
}
