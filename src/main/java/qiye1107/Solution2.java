package qiye1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> cList = new ArrayList<>();

        for (int i=0,j=0; i<A.length && j<B.length;){
            int cLeft = Math.max(A[i][0], B[j][0]);
            int cRight = Math.min(A[i][1], B[j][1]);
            if (cLeft <= cRight){
                int[] c = {cLeft, cRight};
                cList.add(c);
            }

            if (A[i][1] < B[j][1]){
                i++;
            }
            else if (A[i][1] > B[j][1]){
                j++;
            }
            else {
                i++;
                j++;
            }
        }

        int[][] C = new int[cList.size()][2];
        for (int i=0; i<cList.size(); i++){
            C[i] = cList.get(i);
        }

        return C;
    }

    public class Section{
        int left;
        int right;

    }
}
