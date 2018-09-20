package leetcode_0001_0050.leetcode_0033;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:
 *
 *     输入: nums = [4,5,6,7,0,1,2], target = 0
 *     输出: 4
 * 示例 2:
 *
 *     输入: nums = [4,5,6,7,0,1,2], target = 3
 *     输出: -1
 */
public class Solution0033Test {
	Solution0033 solution0033 = new Solution0033();

	@Test
	public void test1(){
		int[] nums = {4,5,6,7,0,1,2};
		Assert.assertEquals(4, solution0033.search(nums, 0));
	}

	@Test
	public void test2(){
		int[] nums = {4,5,6,7,0,1,2};
		Assert.assertEquals(-1, solution0033.search(nums, 3));
	}
}
