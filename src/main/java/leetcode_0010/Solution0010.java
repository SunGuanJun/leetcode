package leetcode_0010;

/**
 * . 任意字母
 * * 0 或多个前一个字母
 * Created by sun on 2018/9/11.
 */
public class Solution0010 {
    public boolean isMatch(String s, String p) {
        if (s.length() == 0){
            if (p.length() == 0){
                return true;
            }
            else {
                if (p.length() == 2 && p.charAt(0) != '*' && p.charAt(1) == '*'){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            if (p.length() == 0){
                return false;
            }
            else {
                return isMatchNotNull(s, p);
            }
        }
    }

    public boolean isMatchNotNull(String s, String p){
        boolean result = false;
        int si = 0, pi = 0;
        char sCurr, pPre, pCurr;

        while (si<s.length() && pi<p.length()){

        }
        if (si < s.length())
            return false;
        if (pi < p.length()){
            if (p.length() - pi == 3 && p.charAt(pi+2) == )
        }

        return result;
    }
}
