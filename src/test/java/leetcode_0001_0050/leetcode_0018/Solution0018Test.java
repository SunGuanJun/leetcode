package leetcode_0001_0050.leetcode_0018;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Solution0018Test {
	Solution0018 solution0018 = new Solution0018();

	@Test
	public void test1(){
		int[] nums = {1, 0, -1, 0, -2, 2};
		System.out.println(JSON.toJSONString(solution0018.fourSum(nums, 0)));
	}
}
