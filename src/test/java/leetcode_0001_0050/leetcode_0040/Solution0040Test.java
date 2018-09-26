package leetcode_0001_0050.leetcode_0040;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Solution0040Test {
	Solution0040 solution0040 = new Solution0040();

	/**
	 * 示例 1:
	 *
	 *     输入: candidates = [10,1,2,7,6,1,5], target = 8,
	 *     所求解集为:
	 *     [
	 *       [1, 7],
	 *       [1, 2, 5],
	 *       [2, 6],
	 *       [1, 1, 6]
	 *     ]
	 * 示例 2:
	 *
	 *     输入: candidates = [2,5,2,1,2], target = 5,
	 *     所求解集为:
	 *     [
	 *       [1,2,2],
	 *       [5]
	 *     ]
	 */
	@Test
	public void test1(){
		int[] nums = {10,1,2,7,6,1,5};
		System.out.println(JSON.toJSONString(solution0040.combinationSum(nums, 8)));
	}

	@Test
	public void test2(){
		int[] nums = {2,5,2,1,2};
		System.out.println(JSON.toJSONString(solution0040.combinationSum(nums, 5)));
	}
}
