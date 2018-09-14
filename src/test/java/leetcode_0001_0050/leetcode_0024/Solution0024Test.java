package leetcode_0001_0050.leetcode_0024;

import org.junit.Test;

public class Solution0024Test {
	Solution0024 solution0024 = new Solution0024();

	@Test
	public void test1(){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l13 = new ListNode(13);
		ListNode l14 = new ListNode(14);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l13;
		l13.next = l14;

		ListNode l = solution0024.swapPairs(l1);
		while (l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}
}
