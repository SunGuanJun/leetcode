package leetcode_0001_0050.leetcode_0040;

import java.util.*;

public class Solution0040 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);
        combine(candidates, target, 0, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    public void combine(int[] nums, int target, int sum, int start, List<Integer> tmpList, Set<List<Integer>> result){
        if (start == nums.length){
            return;
        }
        combine(nums, target, sum, start+1, new ArrayList<>(tmpList), result);

        sum += nums[start];
        tmpList.add(nums[start]);

        if (target == sum){
            result.add(tmpList);
        }
        else if (target > sum){
            combine(nums, target, sum, start+1, tmpList, result);
        }
    }
}
