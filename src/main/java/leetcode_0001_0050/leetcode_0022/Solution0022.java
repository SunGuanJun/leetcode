package leetcode_0001_0050.leetcode_0022;

import java.util.ArrayList;
import java.util.List;

/**
 * [
 *       "((()))",
 *       "(()())",
 *       "(())()",
 *       "()(())",
 *       "()()()"
 *     ]
 */
public class Solution0022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        gen("", n, n, result);
        return result;
    }

    public void gen(String prefix, int left, int right, List<String> result){
        if (left == 0 && right == 1){
            result.add(prefix+")");
            return;
        }
        if (left > 0){
            gen(prefix+"(", left-1, right, result);
        }
        if (right > 0 && right > left){
            gen(prefix+")", left, right-1, result);
        }
    }
}
