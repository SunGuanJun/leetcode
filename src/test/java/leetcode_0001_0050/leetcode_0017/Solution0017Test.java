package leetcode_0001_0050.leetcode_0017;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * 输入："23"
 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class Solution0017Test {
	Solution0017 solution0017 = new Solution0017();

	@Test
	public void test1(){
		System.out.println(JSON.toJSONString(solution0017.letterCombinations("9387")));
	}
}