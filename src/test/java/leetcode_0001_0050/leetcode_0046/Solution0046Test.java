package leetcode_0001_0050.leetcode_0046;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Solution0046Test {
	Solution0046 solution0046 = new Solution0046();

	@Test
	public void test1(){
		int[] nums = {1,2,3};
		System.out.println(JSON.toJSONString(solution0046.permute(nums)));
	}
}