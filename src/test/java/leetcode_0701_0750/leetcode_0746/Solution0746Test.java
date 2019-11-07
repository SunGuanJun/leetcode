package leetcode_0701_0750.leetcode_0746;

import org.junit.Assert;
import org.junit.Test;

public class Solution0746Test {
	Solution0746 solution0746 = new Solution0746();

	@Test
	public void test1(){
		int[] cost1 = {10, 15, 20};
		Assert.assertEquals(15, solution0746.minCostClimbingStairs(cost1));

		int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		Assert.assertEquals(6, solution0746.minCostClimbingStairs(cost2));
	}
}
