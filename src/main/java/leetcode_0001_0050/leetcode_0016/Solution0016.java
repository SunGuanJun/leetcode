package leetcode_0001_0050.leetcode_0016;

import java.util.Arrays;

/**
 * Created by sun on 2018/9/11.
 */
public class Solution0016 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int delta = Integer.MAX_VALUE;
        int closestSum=0;
        for (int i=0; i<nums.length-2; i++){
            int j=i+1, k=nums.length-1;
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target){
                    return sum;
                }
                else if (sum < target){
                    j++;
                }
                else {
                    k--;
                }
                if (Math.abs(sum-target) < delta){
                    delta = Math.abs(sum-target);
                    closestSum = sum;
                }
            }
        }
        return closestSum;
    }
}
