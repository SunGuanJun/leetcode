package leetcode_0001_0050.leetcode_0034;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:
 *
 *     输入: nums = [5,7,7,8,8,10], target = 8
 *     输出: [3,4]
 * 示例 2:
 *
 *     输入: nums = [5,7,7,8,8,10], target = 6
 *     输出: [-1,-1]
 */
public class Solution0034Test {
	Solution0034 solution0034 = new Solution0034();

	@Test
	public void test1(){
		int[] nums = {5,7,7,8,8,10};
		int[] result = {3,4};
		Assert.assertArrayEquals(result, solution0034.searchRange(nums, 8));
	}

	@Test
	public void test2(){
		int[] nums = {5,7,7,8,8,10};
		int[] result = {-1,-1};
		Assert.assertArrayEquals(result, solution0034.searchRange(nums, 6));
	}
}
