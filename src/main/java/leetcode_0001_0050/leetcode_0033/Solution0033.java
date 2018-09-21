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
            else if (nums[left] <= nums[mid] ){
                if (nums[mid] < nums[right]){
                    // 完全顺序
                    return target < nums[mid] ? search(nums, target, left, mid-1)
                            : search(nums, target, mid+1, right);
                }
                else {
                    // 旋转点在右侧
                    if (target < nums[mid] && target >= nums[left]){
                        return search(nums, target, left, mid-1);
                    }
                    else {
                        return search(nums, target, mid+1, right);
                    }
                }
            }
            else {
                if (nums[mid] < nums[right]){
                    // 旋转点在左侧
                    if (target > nums[mid] && target <= nums[right]){
                        return search(nums, target, mid+1, right);
                    }
                    else {
                        return search(nums, target, left, mid-1);
                    }
                }
                else {
                    // 旋转点在右侧
                    if (target < nums[mid] && target >= nums[left]){
                        return search(nums, target, mid+1, right);
                    }
                    else {
                        return search(nums, target, left, mid-1);
                    }
                }
            }
        }
    }
}
