package leetcode_0001_0050.leetcode_0029;

import org.junit.Assert;
import org.junit.Test;

public class Solution0029Test {
	Solution0029 solution0029 = new Solution0029();

	@Test
	public void test1(){
		Assert.assertEquals(3, solution0029.divide(10, 3));
		Assert.assertEquals(-2, solution0029.divide(7, -3));
		Assert.assertEquals(2147483647, solution0029.divide(-2147483648, -1));
	}

	@Test
	public void test2(){
		Assert.assertEquals(Integer.MAX_VALUE, solution0029.divide(Integer.MIN_VALUE, -1));
	}

}
