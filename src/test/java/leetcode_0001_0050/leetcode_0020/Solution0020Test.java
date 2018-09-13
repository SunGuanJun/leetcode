package leetcode_0001_0050.leetcode_0020;

import org.junit.Assert;
import org.junit.Test;

public class Solution0020Test {
	Solution0020 solution0020 = new Solution0020();

	@Test
	public void test1(){
		Assert.assertEquals(true, solution0020.isValid("()"));
		Assert.assertEquals(true, solution0020.isValid("()[]{}"));
		Assert.assertEquals(true, solution0020.isValid("{()}"));
		Assert.assertEquals(false, solution0020.isValid("(]"));
		Assert.assertEquals(false, solution0020.isValid("([)]"));
		Assert.assertEquals(false, solution0020.isValid("]"));
	}
}