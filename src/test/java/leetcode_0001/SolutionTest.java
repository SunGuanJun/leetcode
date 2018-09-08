package leetcode_0001;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/8
 */
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void twoSumTest(){
        int[] nums = {2,7,11,15};
        int[] result = {0,1};
        Assert.assertArrayEquals(solution.twoSum(nums, 9), result);
    }

    @Test
    public void twoSumTest1(){
        int[] nums = {3,2,4};
        int[] result = {1,2};
        Assert.assertArrayEquals(solution.twoSum(nums, 6), result);
    }
}
