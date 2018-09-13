package leetcode_0001_0050.leetcode_0019;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Solution0019Test {
	Solution0019 solution0019 = new Solution0019();

	@Test
	public void test1(){
		ListNode head = new ListNode(1);
		ListNode result = solution0019.removeNthFromEnd(head, 1);
		System.out.println(JSON.toJSONString(result));
	}
}