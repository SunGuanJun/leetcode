package leetcode_0001_0050.leetcode_0030;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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
public class Solution0030Test {
	Solution0030 solution0030 = new Solution0030();

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
	public void test3(){
		List<Integer> result = solution0030.getIndexs("barfoothefoobarman", "foo");
		for (Integer index : result){
			System.out.println(index);
		}

		result = solution0030.getIndexs("barfoothefoobarman", "bar");
		for (Integer index : result){
			System.out.println(index);
		}
	}

	@Test
	public void test4(){
		solution0030.dg(new int[]{1,2,3}, 3);
	}

	@Test
	public void test5(){
		List<Integer> res = solution0030.findSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				new String[]{"a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a","a", "a"});

	}

	@Test
	public void test6(){
		System.out.println("abcdefg".substring(1,4));
		System.out.println("abcdefg".substring(4,7));
		System.out.println("abcdefg".substring(6,7));
	}

	@Test
	public void test7(){
		Map<String, Integer> aMap = new HashMap<>();
		aMap.put("aa", 2);
		aMap.put("bb", 1);

		Map<String, Integer> bMap = new HashMap<>();
		bMap.put("aa", 2);
		bMap.put("bb", 1);

		System.out.println(aMap.equals(bMap));
	}
}
