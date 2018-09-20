package leetcode_0001_0050.leetcode_0033;

public class Solution0033 {
    public int search(int[] nums, int target) {
        search(nums, target, 0, nums.length);
        return 0;
    }

    public int search(int[] nums, int target, int left, int right){
        if (left == right ){
            return nums[left] == target ? left : -1;
        }
        else {
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else {
                if (target >= nums[left]){
                    return search(nums, target, left, mid-1);
                }
                if (target <= nums[right]){
                    return search(nums, target, mid+1, right);
                }
                return -1;
            }
        }
    }
}
