package leetcode_0001_0050.leetcode_0003;

import java.util.HashSet;

/**
 * @Author sunguanjun
 * @Date 2018/9/9
 */
public class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null){
            return 0;
        }
        else if (s.length() <= 1){
            return s.length();
        }
        else {
            int currentLen = 0;
            int maxLen = 0;
            int left = 0;
            HashSet<Character> alphaSet = new HashSet<>();

            for (int i=0; i<s.length(); i++){
                if (alphaSet.contains(s.charAt(i))){
                    while (s.charAt(left) != s.charAt(i)){
                        alphaSet.remove(s.charAt(left));
                        left++;
                        currentLen--;
                    }
                    left++;
                }
                else {
                    alphaSet.add(s.charAt(i));
                    currentLen++;
                }

                if (currentLen > maxLen){
                    maxLen = currentLen;
                }
            }
            return maxLen;
        }
    }
}
