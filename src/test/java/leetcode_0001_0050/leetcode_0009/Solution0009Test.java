package leetcode_0001_0050.leetcode_0009;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/11
 */
public class Solution0009Test {
    Solution0009 solution0009 = new Solution0009();

    @Test
    public void test1(){
        Assert.assertEquals(true, solution0009.isPalindrome(121));
        Assert.assertEquals(false, solution0009.isPalindrome(-121));
        Assert.assertEquals(false, solution0009.isPalindrome(10));
    }

    @Test
    public void test2(){
        Assert.assertEquals(121, solution0009.reverse(121));
        Assert.assertEquals(122, solution0009.reverse(221));

    }
}
