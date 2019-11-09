package qiye1109;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution2 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            Integer count = countMap.get(arr[i]);
            if (count == null){
                count = 0;
            }
            count++;
            countMap.put(arr[i], count);
        }
        if (countMap.values().size() == new HashSet<>(countMap.values()).size()){
            return true;
        }
        else {
            return false;
        }
    }
}
