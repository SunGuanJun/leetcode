package leetcode_0001_0050.leetcode_0026;

public class Solution0026 {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i=0; i<nums.length; i++){
            if (len < i){
                nums[len] = nums[i];
            }
            while (i+1<nums.length && nums[i+1] == nums[i]){
                i++;
            }
            len++;
        }
        return len;
    }
}
