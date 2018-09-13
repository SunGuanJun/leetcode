package leetcode_0001_0050.leetcode_0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *     2 abc
 *     3 def
 *     4 ghi
 *     5 jkl
 *     6 mno
 *     7 pqrs
 *     8 tuv
 *     9 wxyz
 * Created by sun on 2018/9/13.
 */
public class Solution0017 {
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();

        if (digits.length() == 0){
            return results;
        }

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        digit2letter("", digits, 0, map, results);

        return results;
    }

    public void digit2letter(String prefix, String digits, int index, HashMap<Character, String> map, List<String> results){
        String letters = map.get(digits.charAt(index));
        for (int i=0; i<letters.length(); i++){
            if (index == digits.length() - 1){
                results.add(prefix+letters.charAt(i));
            }
            else {
                digit2letter(prefix+letters.charAt(i), digits, index+1, map, results);
            }
        }
    }
}
