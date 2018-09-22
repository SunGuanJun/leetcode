package leetcode_0001_0050.leetcode_0038;

public class Solution0038 {
    public String countAndSay(int n) {
        String s = "1";
        for (int i=1; i<n; i++){
            s = countAndSay(s);
        }
        return s;
    }

    public String countAndSay(String s1) {
        StringBuffer s2 = new StringBuffer();
        char ch;
        int count = 0;
        for (int i=0; i<s1.length(); i++){
            ch = s1.charAt(i);
            count = 1;
            while (i+1<s1.length() && s1.charAt(i+1) == ch){
                i++;
                count++;
            }
            s2.append(count).append(ch);
        }
        return s2.toString();
    }
}
