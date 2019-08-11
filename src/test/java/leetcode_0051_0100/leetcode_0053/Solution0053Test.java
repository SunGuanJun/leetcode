package leetcode_0051_0100.leetcode_0053;

import org.junit.Assert;
import org.junit.Test;

public class Solution0053Test {
	Solution0053 solution0053 = new Solution0053();

	@Test
	public void test1(){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		Assert.assertEquals(6, solution0053.maxSubArray(nums));
	}
}
