package leetcode_0001_0050.leetcode_0043;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:

 输入: num1 = "2", num2 = "3"
 输出: "6"
 示例 2:

 输入: num1 = "123", num2 = "456"
 输出: "56088"
 */
public class Solution0043Test {
	Solution0043 solution0043 = new Solution0043();

	@Test
	public void test1(){
		Assert.assertEquals("6", solution0043.multiply("2", "3"));
	}

	@Test
	public void test2(){
		Assert.assertEquals("56088", solution0043.multiply("123", "456"));
	}
}