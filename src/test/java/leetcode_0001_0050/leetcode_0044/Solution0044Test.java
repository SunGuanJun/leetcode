package leetcode_0001_0050.leetcode_0044;

import org.junit.Assert;
import org.junit.Test;

public class Solution0044Test {
	Solution0044 solution0044 = new Solution0044();

	@Test
	public void test1(){
		Assert.assertEquals(false, solution0044.isMatch("aa", "a"));
	}

	@Test
	public void test2(){
		Assert.assertEquals(true, solution0044.isMatch("aa", "*"));
	}

	@Test
	public void test3(){
		Assert.assertEquals(true, solution0044.isMatch("adceb", "*a*b"));
	}

	@Test
	public void test4(){
		Assert.assertEquals(false, solution0044.isMatch("cb", "?a"));
	}

	@Test
	public void test5(){
		Assert.assertEquals(false, solution0044.isMatch("acdcb", "a*c?b"));
	}

}