package leetcode_0001_0050.leetcode_0002;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/8
 */
public class Solution0002Test {

    Solution0002 solution0002 = new Solution0002();

    @Test
    public void test(){
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        listNode4.next = listNode5;
        ListNode listNode6 = new ListNode(4);
        listNode5.next = listNode6;

        Assert.assertEquals(solution0002.getValue(solution0002.addTwoNumbers(listNode1, listNode4)), 708);
    }

    @Test
    public void test1(){
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;

        Assert.assertEquals(solution0002.getValue(listNode1), 243);
    }
}
