package leetcode_0001_0050.leetcode_0025;

import org.junit.Test;

public class Solution0025Test {
	Solution0025 solution0025 = new Solution0025();

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

		ListNode head = solution0025.reverseKGroup(l1, 8);
		while (head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

	@Test
	public void test2(){
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

		ListNode head = solution0025.reverse(l1, 2);
		while (head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
