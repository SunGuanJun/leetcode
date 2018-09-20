package leetcode_0001_0050.leetcode_0032;

import org.junit.Assert;
import org.junit.Test;

/**
 * 示例 1:
 *
 *     输入: "(()"
 *     输出: 2
 *     解释: 最长有效括号子串为 "()"
 * 示例 2:
 *
 *     输入: ")()())"
 *     输出: 4
 *     解释: 最长有效括号子串为 "()()"
 */
public class Solution0032Test {
	Solution0032 solution0032 = new Solution0032();

	@Test
	public void test1(){
		Assert.assertEquals(2, solution0032.longestValidParentheses("(()"));
	}

	@Test
	public void test2(){
		Assert.assertEquals(4, solution0032.longestValidParentheses(")()())"));
	}

	@Test
	public void test3(){
		Assert.assertEquals(6, solution0032.longestValidParentheses("(((())()"));
	}
}
