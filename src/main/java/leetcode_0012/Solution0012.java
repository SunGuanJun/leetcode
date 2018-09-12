package leetcode_0012;

/**
 * 字符          数值
 *     I             1
 *     V             5
 *     X             10
 *     L             50
 *     C             100
 *     D             500
 *     M             1000
 * Created by sun on 2018/9/11.
 */
public class Solution0012 {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999){
            return "";
        }

        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (num > 0){
            while (num >= nums[i]){
                sb.append(romans[i]);
                num -= nums[i];
            }
            i++;
        }

        return sb.toString();
    }
}
