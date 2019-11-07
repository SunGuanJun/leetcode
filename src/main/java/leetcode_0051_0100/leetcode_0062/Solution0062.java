package leetcode_0051_0100.leetcode_0062;

public class Solution0062 {
    public int uniquePaths(int m, int n) {
        int sum = m + n - 2;
        int sub = Math.min(m, n) - 1;

        long r1 = 1;
        for (int i=0; i<sub; i++){
            r1 *= (sum - i);
        }
        long r2 = 1;
        for (int i=1; i<=sub; i++){
            r2 *= i;
        }
        return (int) (r1 / r2);
    }
}
