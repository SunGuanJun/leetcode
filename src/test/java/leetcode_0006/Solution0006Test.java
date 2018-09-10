package leetcode_0006;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/10
 */
public class Solution0006Test {
    Solution0006 solution0006 = new Solution0006();

    @Test
    public void test1(){
        Assert.assertEquals("PAHNAPLSIIGYIR", solution0006.convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", solution0006.convert("PAYPALISHIRING", 4));
//        Assert.assertEquals("PAYPALISHIRING", solution0006.convert("PAYPALISHIRING", 1));
        Assert.assertEquals("PAYPALISHIRING", solution0006.convert("PAYPALISHIRING", 20));

        Assert.assertEquals("settautcdnhree", solution0006.convert("studentteacher", 5));
        Assert.assertEquals("A", solution0006.convert("A", 1));
    }
}
