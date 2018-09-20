package leetcode_0001_0050.leetcode_0032;

import java.util.Stack;

public class Solution0032 {
    public int longestValidParentheses(String s) {
        int[] flags = new int[s.length()];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                flags[i] = -1;
                stack.push(i);
            }
            else {
                if (stack.empty()){
                    flags[i] = -1;
                }
                else {
                    flags[i] = stack.pop();
                    flags[flags[i]] = i;
                }
            }
        }

        int max = 0, currLen=0;
        for (int i=0; i<s.length(); i++){
            if (flags[i] >= 0){
                currLen++;
                max = max > currLen ? max : currLen;
            }
            else {
                currLen = 0;
            }
        }
        return max;
    }
}
