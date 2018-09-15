package leetcode_0001_0050.leetcode_0028;

import org.junit.Assert;
import org.junit.Test;

public class Solution0028Test {
	Solution0028 solution0028 = new Solution0028();

	@Test
	public void test1(){
		Assert.assertEquals(2, solution0028.strStr("hello", "ll"));
	}

	@Test
	public void test2(){
		Assert.assertEquals(-1, solution0028.strStr("aaaaa", "bba"));
	}

	@Test
	public void test3(){
		Assert.assertEquals(0, solution0028.strStr("aaaaa", ""));
	}

	@Test
	public void test4(){
		Assert.assertEquals(1, solution0028.strStr("mississippi", "issi"));
	}
}
