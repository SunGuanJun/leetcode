package leetcode_0001_0050.leetcode_0045;

import org.junit.Assert;
import org.junit.Test;

public class Solution0045Test {
	Solution0045 solution0045 = new Solution0045();

	@Test
	public void test1(){
		int[] nums = {2,3,1,1,4};
		Assert.assertEquals(2,solution0045.jump(nums));
	}
}