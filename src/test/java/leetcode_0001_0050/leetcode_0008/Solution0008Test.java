package leetcode_0001_0050.leetcode_0008;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/11
 */
public class Solution0008Test {
    Solution0008 solution0008 = new Solution0008();

    @Test
    public void test1(){
        Assert.assertEquals(42, solution0008.myAtoi("42"));
        Assert.assertEquals(-42, solution0008.myAtoi("   -42"));
        Assert.assertEquals(4193, solution0008.myAtoi("4193 with words"));
        Assert.assertEquals(0, solution0008.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, solution0008.myAtoi("-91283472332"));
        Assert.assertEquals(2147483646, solution0008.myAtoi("2147483646"));
    }
}
