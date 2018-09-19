package leetcode_0001_0050.leetcode_0030;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution0030 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int[] flags = new int[words.length];    // 子串是否找到的标志
        List<Integer>[] startIndexArray = new List[s.length()]; // s上每个位置上存在的words的标记

        for (int i=0; i<words.length; i++){
            int subIndex = s.indexOf(words[i]);
            if (subIndex == -1){
                return result;
            }
            else {
                while (subIndex != -1){
                    List<Integer> subIndexs = startIndexArray[subIndex];
                    if (subIndexs == null){
                        subIndexs = new ArrayList<>();
                        startIndexArray[subIndex] = subIndexs;
                    }
                    subIndexs.add(i);
                    subIndex = s.indexOf(words[i], subIndex+1);
                }
            }
        }

        for (int i=0; i<s.length(); i++){
            if (find(startIndexArray, flags, i, words)){
                result.add(i);
            }
        }

        return result;
    }

    public boolean find (List<Integer>[] startIndexArray, int[] flags, int index, String[] words){
        if (index >= startIndexArray.length || startIndexArray[index] == null){
            return false;
        }
        for (int startIndex : startIndexArray[index]){
            if (flags[startIndex] == 1){
                return false;
            }
            else {
                flags[startIndex] = 1;
                boolean allFind = true;
                for (int flag : flags){
                    if (flag == 0){
                        allFind = false;
                        break;
                    }
                }
                if (allFind){
                    clear(flags);
                    return true;
                }
                else {
                    if (find(startIndexArray, flags, index+words[startIndex].length(), words)){
                        clear(flags);
                        return true;
                    }
                    else {
                        flags[startIndex] = 0;
                    }
                }
            }
        }
        return false;
    }

    public void clear(int[] nums){
        for (int i=0; i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public List<Integer> getIndexs(String str, String subStr){
        List<Integer> result = new ArrayList<>();
        int index = str.indexOf(subStr);
        while (index != -1){
            result.add(index);
            index = str.indexOf(subStr, index+1);
        }
        return result;
    }

    public void dg(int[] nums, int k){
        System.out.println(k+" before:" + JSON.toJSONString(nums));
        for (int i=0; i<nums.length; i++){
            nums[i] = k;
        }
        if (k == 0){
            return;
        }
        else {
            dg(nums, k-1);
        }
        System.out.println(k+" after:" + JSON.toJSONString(nums));
    }
}
