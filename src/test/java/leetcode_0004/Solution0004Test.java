package leetcode_0004;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/9
 */
public class Solution0004Test {
    Solution0004 solution0004 = new Solution0004();

    @Test
    public void test1(){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        Assert.assertEquals(solution0004.findMedianSortedArrays(nums1, nums2), 2.5, 0.0001);
        Assert.assertEquals(solution0004.findMedianSortedArray(nums1), 1.5, 0.00001);
    }
}
