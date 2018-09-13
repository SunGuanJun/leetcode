package leetcode_0001_0050.leetcode_0007;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sun on 2018/9/11.
 */
public class Solution0007Test {

    Solution0007 solution0007 = new Solution0007();

    @Test
    public void test1(){
        Assert.assertEquals(321, solution0007.reverse(123));
        Assert.assertEquals(-321, solution0007.reverse(-123));
    }
}
