package leetcode_0001_0050.leetcode_0005;

/**
 * @Author sunguanjun
 * @Date 2018/9/10
 */
public class Solution0005 {
    public String longestPalindrome(String s) {
        if (s==null || s.length() == 0){
            return "";
        }

        int len2 = s.length() * 2 + 1;
        char[] s2 = new char[len2];
        int[] radius = new int[len2];

        // 构造新数组
        for (int i=0; i<s.length(); i++){
            s2[2*i] = '#';
            s2[2*i + 1] = s.charAt(i);
        }
        s2[len2-1] = '#';

        // 计算最长回文半径
        radius[0] = 1;
        int pos = 0;
        int maxRight = 0;
        for (int i=1; i<len2; i++){
            if (i<maxRight){
                int r = radius[2*pos-i] < maxRight-i+1 ? radius[2*pos-i] : maxRight-i+1;
                radius[i] = explore(s2, i, r);
            }
            else {
                radius[i] = explore(s2, i, 1);
            }
        }

        int maxLen=0, maxPos=0;
        for (int i=0;i<len2;i++){
            if (radius[i] > maxLen){
                maxLen = radius[i];
                maxPos = i;
            }
        }
        char[] sub = new char[maxLen-1];
        for (int i=maxPos-maxLen+1,j=0; i<maxPos+maxLen; i++){
            if (s2[i] != '#'){
                sub[j] = s2[i];
                j++;
            }
        }

        return String.valueOf(sub);
    }

    public int explore(char[] chars, int pos, int r){
        while (pos-r >= 0 && pos+r < chars.length){
            if (chars[pos-r] == chars[pos+r]){
                r++;
            }
            else {
                return r;
            }
        }
        return r;
    }

    public static void main(String[] args){
        Solution0005 solution0005 = new Solution0005();
        System.out.println(solution0005.longestPalindrome(""));
    }
}
