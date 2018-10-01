package leetcode_0001_0050.leetcode_0047;

import java.util.*;

public class Solution0047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        permute(nums, 0, result);
        return new ArrayList<>(result);
    }

    void permute(int[] nums, int start, Set<List<Integer>> result){
        if (start == nums.length-1){
            result.add(copy(nums));
            return;
        }
        for (int i=start; i<nums.length; i++){
            swap(nums, start, i);
            permute(nums, start+1, result);
            swap(nums, start, i);
        }
    }

    List<Integer> copy (int[] nums){
        List<Integer> result = new ArrayList<>(nums.length);
        for (int i=0; i<nums.length; i++){
            result.add(nums[i]);
        }
        return result;
    }

    void swap (int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
