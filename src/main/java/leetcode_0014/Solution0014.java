package leetcode_0014;

/**
 * Created by sun on 2018/9/11.
 */
public class Solution0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }

        int shortestLen = Integer.MAX_VALUE;
        for (String string : strs){
            shortestLen = string.length() < shortestLen ? string.length() : shortestLen;
        }
        char[] prefix = new char[shortestLen];
        char ch;
        for (int i=0; i<shortestLen; i++){
            ch = strs[0].charAt(i);
            for (int j=1; j<strs.length; j++){
                if (ch != strs[j].charAt(i)){
                    return new String (prefix, 0, i);
                }
            }
            prefix[i] = ch;
        }

        return new String(prefix);
    }
}
