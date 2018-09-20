package leetcode_0001_0050.leetcode_0033;

public class Solution0033 {
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        return search(nums, target, 0, nums.length-1);
    }

    public int search(int[] nums, int target, int left, int right){
        if (right - left <= 1){
            if (nums[left] == target){
                return left;
            }
            else if (nums[right] == target){
                return right;
            }
            return -1;
        }
        else {
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else {
                if (target >= nums[left] && target != nums[right]){
                    return search(nums, target, left, mid-1);
                }
                else if (target <= nums[right]){
                    return search(nums, target, mid+1, right);
                }
                return -1;
            }
        }
    }
}
