package leetcode_0101_0150.leetcode_0121;

import org.junit.Assert;
import org.junit.Test;

public class Solution0121Test {
	Solution0121 solution0121 = new Solution0121();

	@Test
	public void test1(){
		int[] prices = {7,1,5,3,6,4};
		Assert.assertEquals(5, solution0121.maxProfit(prices));
	}

	@Test
	public void test2(){
		int[] prices = {7,6,4,3,1};
		Assert.assertEquals(0, solution0121.maxProfit(prices));
	}
}
