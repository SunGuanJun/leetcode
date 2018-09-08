package leetcode_0003;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/9
 */
public class Solution0003Test {
    Solution0003 solution0003 = new Solution0003();

    @Test
    public void test1(){
        Assert.assertEquals(solution0003.lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.assertEquals(solution0003.lengthOfLongestSubstring("bbbbb"), 1);
        Assert.assertEquals(solution0003.lengthOfLongestSubstring("pwwkew"), 3);
    }
}
