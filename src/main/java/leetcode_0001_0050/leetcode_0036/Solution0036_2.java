package leetcode_0001_0050.leetcode_0036;

import java.util.HashSet;
import java.util.Set;

public class Solution0036_2 {
    public boolean isValidSudoku(char[][] board) {
        int value,x,y;
        for (int i=0; i<9; i++){
            int[] flags1 = new int[9];
            int[] flags2 = new int[9];
            int[] flags3 = new int[9];
            for (int j=0; j<9; j++){
                if (board[i][j] != '.'){
                    value = board[i][j] - '1';
                    if (flags1[value] == 1){
                        return false;
                    }
                    else {
                        flags1[value] = 1;
                    }
                }
                if (board[j][i] != '.'){
                    value = board[j][i] - '1';
                    if (flags2[value] == 1){
                        return false;
                    }
                    else {
                        flags2[value] = 1;
                    }
                }

                x = 3 * (i/3) + j/3;
                y = 3 * (i%3) + j%3;
                if (board[x][y] != '.'){
                    value = board[x][y] - '1';
                    if (flags3[value] == 1){
                        return false;
                    }
                    else {
                        flags3[value] = 1;
                    }
                }
            }
        }

        return true;
    }
}
