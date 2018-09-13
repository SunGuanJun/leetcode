package leetcode_0001_0050.leetcode_0001;

import java.util.HashMap;

/**
 *
 * @Author sunguanjun
 * @Date 2018/9/8
 */
public class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        int len = nums.length;
        int tmp;
        for (int i=0; i<len; i++){
            tmp = target - nums[i];
            if (map.containsKey(tmp)){
                result[0] = map.get(tmp);
                result[1] = i;
            }
            else {
                map.put(nums[i], i);
            }
        }

        return result;
    }


    public static void main(String[] args){
        System.out.println("hello world");
    }
}
