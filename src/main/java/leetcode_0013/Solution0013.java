package leetcode_0013;

import java.util.HashMap;

/**
 *  * 字符          数值
 *     I             1
 *     V             5
 *     X             10
 *     L             50
 *     C             100
 *     D             500
 *     M             1000
 * Created by sun on 2018/9/11.
 */
public class Solution0013 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int currentInt = 1;
        int result = 0;
        int tmp;

        for (int i=s.length()-1; i>=0; i--){
            tmp = map.get(s.charAt(i));
            if (tmp >= currentInt){
                result += tmp;
                currentInt = tmp;
            }
            else {
                result -= tmp;
            }
        }
        return result;
    }
}
