package leetcode_0001_0050.leetcode_0039;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class Solution0039Test {
	Solution0039 solution0039 = new Solution0039();

	@Test
	public void test1(){
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(7));
		result.add(Arrays.asList(2,2,3));

		List<List<Integer>> result2 = new ArrayList<>();
		result2.add(Arrays.asList(7));
		result2.add(Arrays.asList(2,2,3));

		Assert.assertEquals(result, result2);
	}


	@Test
	public void test2(){
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(7));
		result.add(Arrays.asList(2,2,3));

		int[] nums = {2,3,6,7};
		Assert.assertEquals(result, solution0039.combinationSum(nums, 7));
	}

	@Test
	public void test3(){
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(2,2,2,2));
		result.add(Arrays.asList(2,3,3));
		result.add(Arrays.asList(3,5));

		int[] nums = {2,3,5};

		Assert.assertEquals(result, solution0039.combinationSum(nums, 8));
	}
}
