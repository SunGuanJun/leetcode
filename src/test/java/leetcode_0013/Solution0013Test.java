package leetcode_0013;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sun on 2018/9/12.
 */
public class Solution0013Test {
    Solution0013 solution0013 = new Solution0013();

    @Test
    public void test1(){
        Assert.assertEquals(solution0013.romanToInt("III"), 3);
        Assert.assertEquals(solution0013.romanToInt("IV"), 4);
        Assert.assertEquals(solution0013.romanToInt("IX"), 9);
        Assert.assertEquals(solution0013.romanToInt("LVIII"), 58);
        Assert.assertEquals(solution0013.romanToInt("MCMXCIV"), 1994);
    }
}
