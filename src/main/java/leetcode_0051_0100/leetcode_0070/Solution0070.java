package leetcode_0051_0100.leetcode_0070;

public class Solution0070 {
    public int climbStairs(int n) {
        if (n <= 3){
            return n;
        }
        else {
            int a = 2, b=3;
            int tmp = 5;
            for (int i=3; i<=n; i++){
                tmp = a + b;
                a = b;
                b = tmp;
            }
            return tmp;
        }
    }
}
