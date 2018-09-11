package leetcode_0009;

/**
 * Created by sun on 2018/9/11.
 */
public class Solution0009 {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        else if (x == 0) {
            return true;
        }
        else {
            return x == reverse(x);
        }
    }

    public int reverse(int x){
        int y = 0;
        while (x != 0){
            y = y * 10 + x % 10;
            x /= 10;
        }
        return y;
    }
}
