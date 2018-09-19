package leetcode_0001_0050.leetcode_0031;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

/**
 * 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */
public class Solution0031Test {
	Solution0031 solution0031 = new Solution0031();

	@Test
	public void test1(){
		int[] nums = {1,2,3};
		int[] nums2 = {1,3,2};
		solution0031.nextPermutation(nums);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test2(){
		int[] nums = {3,2,1};
		int[] nums2 = {1,2,3};
		solution0031.nextPermutation(nums);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test3(){
		int[] nums = {1,1,5};
		int[] nums2 = {1,5,1};
		solution0031.nextPermutation(nums);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test31(){
		int[] nums = {1,5,1};
		int[] nums2 = {5,1,1};
		solution0031.nextPermutation(nums);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test4(){
		int[] nums = {1,2};
		int[] nums2 = {2,1};
		solution0031.nextPermutation(nums);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test5(){
		int[] nums = {1,2,3,4};
		int[] nums2 = {1,2,4,3};
		solution0031.nextPermutation(nums);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test6(){
		int[] nums = {2,3,1};
		int[] nums2 = {3,1,2};
		solution0031.nextPermutation(nums);
		System.out.println(JSON.toJSONString(nums));
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void test7(){
		int[] nums = {1,2, 9,8,7};
		int[] nums2 = {1,7,2,8,9};
		solution0031.nextPermutation(nums);
		System.out.println(JSON.toJSONString(nums));
		Assert.assertArrayEquals(nums2, nums);
	}


	@Test
	public void swapAllTest1(){
		int[] nums = {1,1,5};
		int[] nums2 = {5, 1,1};
		solution0031.swapAll(nums, 0, nums.length-1);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void swapAllTest2(){
		int[] nums = {1,1,1,5};
		int[] nums2 = {5, 1, 1,1};
		solution0031.swapAll(nums, 0, nums.length-1);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void swapAllTest3(){
		int[] nums = {1,2};
		int[] nums2 = {2, 1};
		solution0031.swapAll(nums, 0, nums.length-1);
		Assert.assertArrayEquals(nums2, nums);
	}

	@Test
	public void swapAllTest4(){
		int[] nums = {1,2,3,4,5,6,7,8};
		int[] nums2 = {1,5,4,3,2, 6,7,8};
		solution0031.swapAll(nums, 1,4);
		Assert.assertArrayEquals(nums2, nums);
	}

}