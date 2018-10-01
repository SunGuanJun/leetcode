package leetcode_0001_0050.leetcode_0046;

import java.util.ArrayList;
import java.util.List;

public class Solution0046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    void permute(int[] nums, int start, List<List<Integer>> result){
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
