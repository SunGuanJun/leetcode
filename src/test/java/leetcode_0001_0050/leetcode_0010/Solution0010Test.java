package leetcode_0001_0050.leetcode_0010;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/11
 */
public class Solution0010Test {
    Solution0010 solution0010 = new Solution0010();

    @Test
    public void test1(){
        Assert.assertEquals(false, solution0010.isMatch("aa", "a"));
        Assert.assertEquals(true, solution0010.isMatch("aa", "a*"));
        Assert.assertEquals(true, solution0010.isMatch("ab", ".*"));
        Assert.assertEquals(true, solution0010.isMatch("aab", "c*a*b"));
        Assert.assertEquals(false, solution0010.isMatch("mississippi", "mis*is*p*."));
    }
}
