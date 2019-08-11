package leetcode_0051_0100.leetcode_0053;

public class Solution0053 {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for (int i=1; i<nums.length; i++){
            /** decide where to start **/
            sum = Math.max(nums[i], nums[i] + sum);
            /** decide where to end **/
            result = Math.max(result, sum);
        }
        return result;
    }
}
