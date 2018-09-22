package leetcode_0001_0050.leetcode_0036;

public class Solution0036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++){
            if (!checkRow(board, i)){
                return false;
            }
        }
        for (int i=0; i<9; i++){
            if (!checkColumn(board, i)){
                return false;
            }
        }
        for (int i=0; i<9; i+=3){
            for (int j=0; j<9; j+=3){
                if (!checkBlock(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int row){
        int[] flag = new int[10];
        int value;
        for (int i=0; i<9; i++){
            if (board[row][i] != '.'){
                value = board[row][i] - '0';
                if (flag[value] == 1){
                    return false;
                }
                else {
                    flag[value] = 1;
                }
            }
        }
        return true;
    }

    public boolean checkColumn(char[][] board, int column){
        int[] flag = new int[10];
        int value;
        for (int i=0; i<9; i++){
            if (board[i][column] != '.'){
                value = board[i][column] - '0';
                if (flag[value] == 1){
                    return false;
                }
                else {
                    flag[value] = 1;
                }
            }
        }
        return true;
    }

    public boolean checkBlock(char[][] board, int row, int column){
        int[] flag = new int[10];
        int value;
        for (int i=row; i<row+3; i++){
            for (int j=column; j<column+3; j++){
                if (board[i][j] != '.'){
                    value = board[i][j] - '0';
                    if (flag[value] == 1){
                        return false;
                    }
                    else {
                        flag[value] = 1;
                    }
                }
            }
        }
        return true;
    }
}
