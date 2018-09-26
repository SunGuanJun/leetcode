package leetcode_0001_0050.leetcode_0047;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Solution0047Test {
	Solution0047 solution0047 = new Solution0047();

	@Test
	public void test1(){
		System.out.println(JSON.toJSONString(solution0047.permuteUnique(new int[]{1,1,2})));
	}
}