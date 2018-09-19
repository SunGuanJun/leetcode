package leetcode_0001_0050.leetcode_0030;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Solution0030_2 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (words.length == 0 && s.length() == 0){
            return result;
        }
        int wordLen = words[0].length();
        int dValue = s.length() - wordLen * words.length;
        if (dValue < 0){
            return result;
        }
        int[][] flags = new int[words.length][s.length()];
        int[] hasWords = new int[words.length];

        for (int i=0; i<words.length; i++){
            int index = s.indexOf(words[i]);
            if (index == -1){
                return result;
            }
            while (index != -1){
                flags[i][index] = 1;
                index = s.indexOf(words[i], index+1);
            }
        }
        for (int i=0; i<=dValue; i++){
            int iinner = i;
            boolean iHasNoWord;
            int count=0;
            while (iinner < s.length() && count<words.length){
                iHasNoWord = true;
                for (int j=0; j<words.length; j++){
                    if (flags[j][iinner] == 1){
                        hasWords[j] = 1;
                        iHasNoWord = false;
                    }
                }
                if (!iHasNoWord){
                    break;
                }
                iinner += wordLen;
                count++;
            }
            if (count == words.length && allExisted(hasWords)){
                result.add(i);
            }
        }
        return result;
    }



    public void clear(int[] nums){
        for (int i=0; i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public boolean allExisted(int[] nums){
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                return false;
            }
        }
        return true;
    }

}
