package leetcode_0001_0050.leetcode_0050;

import org.junit.Assert;
import org.junit.Test;

public class Solution0050Test {
	Solution0050 solution0050 = new Solution0050();

	@Test
	public void test1(){
		Assert.assertEquals(1024.0, solution0050.myPow(2.0, 10), 0.00001);
	}

	@Test
	public void test2(){
		Assert.assertEquals(9.26100, solution0050.myPow(2.10, 3), 0.00001);
	}

	@Test
	public void test3(){
		Assert.assertEquals(0.25000, solution0050.myPow(2.00000, -2), 0.00001);
	}

}