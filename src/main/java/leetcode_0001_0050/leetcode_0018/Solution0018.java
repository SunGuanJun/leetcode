package leetcode_0001_0050.leetcode_0018;

import java.util.*;

/**
 * Created by sun on 2018/9/13.
 */
public class Solution0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Set<List<Integer>> results = new HashSet<>();
        for (int i1=0; i1<nums.length-3; i1++){
            for (int i2=i1+1; i2<nums.length-2; i2++){
                int i3=i2+1, i4=nums.length-1;
                while (i3<i4){
                    int sum = nums[i1] + nums[i2] + nums[i3] + nums[i4];
                    if (sum == target){
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i1]);
                        result.add(nums[i2]);
                        result.add(nums[i3]);
                        result.add(nums[i4]);
                        results.add(result);
                        do {
                            i3++;
                        } while (i3<nums.length-1 && nums[i3]== nums[i3-1]);
                        do {
                            i4--;
                        } while (i4>0 && nums[i4]==nums[i4+1]);
                    }
                    else if (sum < target){
                        i3++;
                    }
                    else {
                        i4--;
                    }
                }
            }
        }
        return new ArrayList<>(results);
    }
}
