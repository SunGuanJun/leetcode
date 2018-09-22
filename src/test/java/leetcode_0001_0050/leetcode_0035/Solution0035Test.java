package leetcode_0001_0050.leetcode_0035;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class Solution0035Test {
	Solution0035 solution0035 = new Solution0035();

	@Test
	public void test1(){
		int[] nums = {1,3,5,6};
		Assert.assertEquals(2, solution0035.searchInsert(nums, 5));
	}

	@Test
	public void test2(){
		int[] nums = {1,3,5,6};
		Assert.assertEquals(1, solution0035.searchInsert(nums, 2));
	}

	@Test
	public void test3(){
		int[] nums = {1,3,5,6};
		Assert.assertEquals(4, solution0035.searchInsert(nums, 7));
	}

	@Test
	public void test4(){
		int[] nums = {1,3,5,6};
		Assert.assertEquals(0, solution0035.searchInsert(nums, 0));
	}
}
