package leetcode_0001_0050.leetcode_0041;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:

 输入: [1,2,0]
 输出: 3
 示例 2:

 输入: [3,4,-1,1]
 输出: 2
 示例 3:

 输入: [7,8,9,11,12]
 输出: 1
 */
public class Solution0041Test {
	Solution0041 solution0041 = new Solution0041();

	@Test
	public void test1(){
		int[] nums = {1,2,0};
		Assert.assertEquals(3, solution0041.firstMissingPositive(nums));
	}

	@Test
	public void test2(){
		int[] nums = {3,4,-1,1};
		Assert.assertEquals(2, solution0041.firstMissingPositive(nums));
	}

	@Test
	public void test3(){
		int[] nums = {7,8,9,11,12};
		Assert.assertEquals(1, solution0041.firstMissingPositive(nums));
	}
}