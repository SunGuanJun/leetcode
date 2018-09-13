package leetcode_0001_0050.leetcode_0015;

import java.util.*;

/**
 * Created by sun on 2018/9/11.
 */
public class Solution0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length-2; i++){
            int j=i+1, k=nums.length-1;
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0){
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[k]);
                    result.add(item);
                    do {
                        j++;
                    } while (j<nums.length-1 && nums[j]==nums[j-1]);
                    do {
                        k--;
                    } while (k>0 && nums[k]==nums[k+1]);
                }
                else if (sum < 0){
                    j++;
                }
                else {
                    k--;
                }
            }
            while (i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
        }

        return result;
    }
}
