package leetcode_0001_0050.leetcode_0030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0030_3 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordCount = words.length;

        if (wordCount == 0 || s.length() == 0){
            return result;
        }
        int wordLength = words[0].length();
        int sLength = s.length();
        int end = s.length() - wordCount * wordLength;
        if (end < 0){
            return result;
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        Map<String, Integer> tmpWordCountMap = new HashMap<>();
        for (String word : words){
            incrMap(wordCountMap, word);
        }

        int tmpWordCount, j;
        for (int i=0; i<=end; i++){
            tmpWordCountMap.clear();
            tmpWordCount = 0;
            j=i;
            String keyStr = s.substring(j, j+wordLength);
            while (wordCountMap.get(keyStr) != null){
                incrMap(tmpWordCountMap, keyStr);
                tmpWordCount++;
                j += wordLength;
                if (tmpWordCount == wordCount || i+wordLength > sLength){
                    break;
                }
                keyStr = s.substring(j, j+wordLength);
            }
            if (tmpWordCount == wordCount && tmpWordCountMap.equals(wordCountMap)){
                result.add(i);
            }
        }


        return result;
    }

    public void incrMap(Map<String, Integer> map, String key){
        if (map.get(key) == null){
            map.put(key, 1);
        }
        else {
            map.put(key, map.get(key) + 1);
        }
    }

}
