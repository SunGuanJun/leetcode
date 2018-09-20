package leetcode_0001_0050.leetcode_0030;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 输入:
 *   s = "barfoothefoobarman",
 *   words = ["foo","bar"]
 * 输出: [0,9]
 * 解释: 从索引 0 和 9 开始的子串分别是 "barfoor" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * 示例 2:
 *
 * 输入:
 *   s = "wordgoodstudentgoodword",
 *   words = ["word","student"]
 * 输出: []
 */
public class Solution0030_3Test {
	Solution0030_3 solution0030 = new Solution0030_3();

	@Test
	public void test1(){
		Assert.assertEquals(Arrays.asList(0,9),
				solution0030.findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
	}

	@Test
	public void test2(){
		Assert.assertEquals(Arrays.asList(),
				solution0030.findSubstring("wordgoodstudentgoodword", new String[]{"word", "good"}));
	}


	@Test
	public void test5(){
		List<Integer> res = solution0030.findSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				new String[]{"a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a"});
		System.out.println(JSON.toJSONString(res));
	}
}
