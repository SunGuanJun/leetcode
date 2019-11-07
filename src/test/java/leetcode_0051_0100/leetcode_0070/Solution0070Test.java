package leetcode_0051_0100.leetcode_0070;

import org.junit.Assert;
import org.junit.Test;

public class Solution0070Test {
	Solution0070 solution0070 = new Solution0070();

	@Test
	public void test1(){
		Assert.assertEquals(solution0070.climbStairs(2), 2);
		Assert.assertEquals(solution0070.climbStairs(3), 3);
	}
}
