package leetcode_0001_0050.leetcode_0042;

import org.junit.Assert;
import org.junit.Test;

public class Solution0042Test {
	Solution0042 solution0042 = new Solution0042();

	@Test
	public void test1(){
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		Assert.assertEquals(6, solution0042.trap(nums));
	}
}