package leetcode_0005;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/10
 */
public class Solution0005Test {
    Solution0005 solution0005 = new Solution0005();

    @Test
    public void test1(){
        Assert.assertEquals(solution0005.longestPalindrome("cbbd"), "bb");
        Assert.assertEquals(solution0005.longestPalindrome("babad"), "bab");
    }

    @Test
    public void test2(){
        char[] chars = "babab".toCharArray();
        Assert.assertEquals(solution0005.explore(chars, 3, 1), 2);
        Assert.assertEquals(solution0005.explore(chars, 0, 1), 1);
        Assert.assertEquals(solution0005.explore(chars, 4, 1), 1);
        Assert.assertEquals(solution0005.explore(chars, 2, 1), 3);
    }
}
