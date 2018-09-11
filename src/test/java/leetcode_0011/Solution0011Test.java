package leetcode_0011;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/11
 */
public class Solution0011Test {

    Solution0011 solution0011 = new Solution0011();

    @Test
    public void test1(){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49, solution0011.max(heights));
    }
}
