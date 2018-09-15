package leetcode_0001_0050.leetcode_0027;

import org.junit.Assert;
import org.junit.Test;

public class Solution0027Test {
	Solution0027 solution0027 = new Solution0027();

	@Test
	public void test1(){
//		int[] nums = {0,1,2,2,3,0,4,2};
		int[] nums = {3,2,2,3};
//		int[] nums = {1};

		// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
		int len = solution0027.removeElement(nums, 3);

		// 在函数里修改输入数组对于调用者是可见的。
		// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
		Assert.assertEquals(2, len);
	}

	@Test
	public void test2(){
		int[] nums = {0,1,2,2,3,0,4,2};

		// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
		int len = solution0027.removeElement(nums, 2);

		// 在函数里修改输入数组对于调用者是可见的。
		// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
		Assert.assertEquals(5, len);
	}

	@Test
	public void test3(){
		int[] nums = {1};

		// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
		int len = solution0027.removeElement(nums, 1);

		// 在函数里修改输入数组对于调用者是可见的。
		// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
		Assert.assertEquals(0, len);
	}
}
