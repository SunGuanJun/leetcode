package leetcode_0001_0050.leetcode_0039;

import java.util.*;

public class Solution0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combine(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void combine(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if (remain < 0) {
            return;
        }
        else if (remain == 0) {
            list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                combine(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
