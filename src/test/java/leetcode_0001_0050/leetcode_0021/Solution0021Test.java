package leetcode_0001_0050.leetcode_0021;

import org.junit.Test;

/**
 * 输入：1->2->4, 1->3->4
 *     输出：1->1->2->3->4->4
 */
public class Solution0021Test {
	Solution0021 solution0021 = new Solution0021();

	@Test
	public void test1(){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;

		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;

		ListNode l = solution0021.mergeTwoLists(l1, l4);
		while (l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}
}
