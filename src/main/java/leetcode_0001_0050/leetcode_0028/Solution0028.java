package leetcode_0001_0050.leetcode_0028;

public class Solution0028 {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length();
        int l2=needle.length();

        if (l2 == 0){
            return 0;
        }
        if(l2>l1){
            return -1;
        }

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        for (int i=0; i<l1; i++){
            if (chars1[i] == chars2[0]){
                int i1=i+1;
                int j;
                for (j=1;j<l2 && i1<l1; i1++,j++){
                    if (chars1[i1] != chars2[j]){
                        break;
                    }
                }
                if (j == l2){
                    return i;
                }
            }
        }
        return -1;
    }
}
