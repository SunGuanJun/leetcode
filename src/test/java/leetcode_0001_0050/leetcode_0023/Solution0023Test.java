package leetcode_0001_0050.leetcode_0023;

import org.junit.Test;

public class Solution0023Test {
	Solution0023 solution0023 = new Solution0023();

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

		ListNode l7 = new ListNode(2);
		ListNode l8 = new ListNode(5);
		ListNode l9 = new ListNode(8);
		l7.next = l8;
		l8.next = l9;

		ListNode[] listNodes = {l1, l4, l7};

		ListNode l = solution0023.mergeKLists(listNodes);

		while (l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}

	@Test
	public void test2(){
		ListNode[] listNodes = {null, new ListNode(1), new ListNode(2)};
		ListNode l = solution0023.mergeKLists(listNodes);

		while (l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}
}
