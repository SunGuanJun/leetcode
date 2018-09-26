package leetcode_0001_0050.leetcode_0041;

public class Solution0041 {
    public int firstMissingPositive(int[] nums) {
        for (int i=0; i<nums.length ; i++){
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]){
                swap(nums, nums[i]-1, i);
            }
        }

        for (int i=0; i<nums.length; i++){
            if (nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }

    public void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}