package leetcode_0001_0050.leetcode_0031;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */
public class Solution0031 {

    public void nextPermutation(int[] nums) {
        for (int i=nums.length-1; i>0; i--){
            if (nums[i] > nums[i-1]){
                int right = findBigger(nums, i+1, nums[i-1]);
                swap(nums, i-1, right);
                Arrays.sort(nums, i, nums.length);
                return;
            }
        }
        swapAll(nums, 0, nums.length-1);
    }

    public int findBigger(int[] nums, int start, int target){
        while (start < nums.length){
            if (nums[start] <= target){
                return start-1;
            }
            start++;
        }
        return start-1;
    }

    public void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public void swapAll(int[] nums, int start, int end){
        int iEnd = start + (end - start + 1) / 2;
        for (int i=start; i<iEnd; i++){
            swap(nums, i, start+end-i);
        }
    }
}
