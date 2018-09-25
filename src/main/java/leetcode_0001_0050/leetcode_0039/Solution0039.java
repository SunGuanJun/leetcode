package leetcode_0001_0050.leetcode_0039;

import java.util.ArrayList;
import java.util.List;

public class Solution0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combine(candidates, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    public void combine(int[] nums, int target, int sum, int start,List<Integer> tmpList, List<List<Integer>> result){
        if (start == nums.length){
            return;
        }
        combine(nums, target, sum, start+1, new ArrayList<>(tmpList), result);
        while (sum<target){
            sum+=nums[start];
            tmpList.add(nums[start]);
        }
        if (sum == target){
            result.add(tmpList);
        }
        else {
            tmpList.remove(nums[start]);
            sum-= nums[start];
            combine(nums, target, sum, start+1, new ArrayList<>(tmpList), result);
        }
    }
}
