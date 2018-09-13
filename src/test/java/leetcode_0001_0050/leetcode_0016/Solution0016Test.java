package leetcode_0001_0050.leetcode_0016;

import org.junit.Assert;
import org.junit.Test;

public class Solution0016Test {
	Solution0016 solution0016 = new Solution0016();

	@Test
	public void test1(){
		int[] nums = {-1, 2, 1, -4};
		Assert.assertEquals(2, solution0016.threeSumClosest(nums, 1));
	}
}