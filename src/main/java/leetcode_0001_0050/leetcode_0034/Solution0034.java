package leetcode_0001_0050.leetcode_0034;

public class Solution0034 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){
            return new int[]{-1, -1};
        }
        int index = binSearch(nums, target, 0, nums.length-1);
        if (index == -1){
            return new int[]{-1, -1};
        }
        else {
            int left = index-1;
            while (left>=0 && nums[left] == target){
                left--;
            }
            int right = index + 1;
            while (right < nums.length && nums[right] == target){
                right++;
            }
            return new int[]{left+1, right-1};
        }
    }

    public int binSearch(int[] nums, int target, int left, int right){
        if (right - left <= 1){
            if (nums[left] == target){
                return left;
            }
            if (nums[right] == target){
                return right;
            }
            return  -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target){
            return mid;
        }
        else if (nums[mid] > target){
            return binSearch(nums, target, left, mid-1);
        }
        else {
            return binSearch(nums, target, mid+1, right);
        }
    }
}
