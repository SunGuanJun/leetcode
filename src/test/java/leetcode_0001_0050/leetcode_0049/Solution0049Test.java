package leetcode_0001_0050.leetcode_0049;

import org.junit.Test;

public class Solution0049Test {
	Solution0049 solution0049 = new Solution0049();

	@Test
	public void test1(){
		System.out.println(solution0049.groupAnagrams(
				new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
}