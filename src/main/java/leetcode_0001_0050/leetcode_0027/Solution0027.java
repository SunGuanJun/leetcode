package leetcode_0001_0050.leetcode_0027;

public class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int len = 0, i=0;
        while (i<nums.length){
            while (i<nums.length && nums[i] == val){
                i++;
            }
            if (i==nums.length){
                break;
            }
            nums[len] = nums[i];
            len++;
            i++;
        }
        return len;
    }
}
