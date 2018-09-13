package leetcode_0001_0050.leetcode_0006;

/**
 * @Author sunguanjun
 * @Date 2018/9/10
 */
public class Solution0006 {
    public String convert(String s, int numRows) {
        if (s==null || s.length()==0 || numRows<1){
            return "";
        }

        int index = 0, resultIndex=0;
        int len = s.length();
        char[] result = new char[len];

        for (int i=1; i<=numRows && i<=len; i++){
            // 第一行 或 最后一行，只有两个
            if (i==1 || i==numRows){
                index = i-1;
                while (index < len){
                    result[resultIndex] = s.charAt(index);
                    if (numRows == 1){
                        index++;
                    }
                    else {
                        index += 2 * (numRows - 1);
                    }
                    resultIndex++;
                }
            }
            else {
                // 中间n-2行，有三个
                index = i-1;
                boolean midFlag = true;
                while (index < len){
                    result[resultIndex] = s.charAt(index);
                    resultIndex++;
                    if (midFlag){
                        index += 2 * (numRows - i);
                        midFlag = false;
                    }
                    else {
                        index += 2 * (i - 1);
                        midFlag = true;
                    }
                }
            }
        }

        return String.valueOf(result);
    }
}
