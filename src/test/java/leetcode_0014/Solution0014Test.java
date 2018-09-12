package leetcode_0014;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sun on 2018/9/12.
 */
public class Solution0014Test {
    Solution0014 solution0014 = new Solution0014();

    @Test
    public void test1(){
        String[] strings1 = {"flower", "flow", "flight", "fl"};
        Assert.assertEquals("fl", solution0014.longestCommonPrefix(strings1));

        String[] strings2 = {"dog","racecar","car"};
        Assert.assertEquals("", solution0014.longestCommonPrefix(strings2));
    }
}
