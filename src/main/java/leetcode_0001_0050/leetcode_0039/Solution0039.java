package leetcode_0001_0050.leetcode_0039;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        combine(candidates, target, 0, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    public void combine(int[] nums, int target, int sum, int start,List<Integer> tmpList, Set<List<Integer>> result){
        if (start == nums.length){
            return;
        }
        combine(nums, target, sum, start+1, new ArrayList<>(tmpList), result);
        while (sum<target){
            sum+=nums[start];
            tmpList.add(nums[start]);
            combine(nums, target, sum, start+1, new ArrayList<>(tmpList), result);
        }
        if (sum == target){
            result.add(tmpList);
        }
        else {
            tmpList.remove(tmpList.size()-1);
            sum-= nums[start];
            combine(nums, target, sum, start+1, new ArrayList<>(tmpList), result);
        }
    }
}
