package leetcode_0001_0050.leetcode_0026;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定数组 nums = [1,1,2],
 *
 *     函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 *     函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 */
public class Solution0026Test {
	Solution0026 solution0026 = new Solution0026();

	@Test
	public void test1(){
		int[] nums = {1,1,2};
		// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
		int len = solution0026.removeDuplicates(nums);

		// 在函数里修改输入数组对于调用者是可见的。
		// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
		Assert.assertEquals(2, len);
	}

	@Test
	public void test2(){
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
		int len = solution0026.removeDuplicates(nums);

		// 在函数里修改输入数组对于调用者是可见的。
		// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
		Assert.assertEquals(5, len);
	}
}
