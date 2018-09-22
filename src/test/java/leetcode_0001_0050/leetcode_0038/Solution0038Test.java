package leetcode_0001_0050.leetcode_0038;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 */
public class Solution0038Test {
	Solution0038 solution0038 = new Solution0038();

	@Test
	public void test1(){
		Assert.assertEquals("1", solution0038.countAndSay(1));
	}

	@Test
	public void test2(){
		Assert.assertEquals("1211", solution0038.countAndSay(4));
	}
}
