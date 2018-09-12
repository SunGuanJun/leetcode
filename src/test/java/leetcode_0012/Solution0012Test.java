package leetcode_0012;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/12
 */
public class Solution0012Test {
    Solution0012 solution0012 = new Solution0012();


    @Test
    public void test1(){
        Assert.assertEquals(solution0012.intToRoman(3), "III");
        Assert.assertEquals(solution0012.intToRoman(4), "IV");
        Assert.assertEquals(solution0012.intToRoman(9), "IX");
        Assert.assertEquals(solution0012.intToRoman(58), "LVIII");
        Assert.assertEquals(solution0012.intToRoman(1994), "MCMXCIV");
    }

}
