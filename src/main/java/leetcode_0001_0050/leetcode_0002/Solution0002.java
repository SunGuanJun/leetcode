package leetcode_0001_0050.leetcode_0002;

/**
 * @Author sunguanjun
 * @Date 2018/9/8
 */
public class Solution0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result, unit, l1Val, l2Val;
        int decade = 0;
        ListNode l3 = null;
        ListNode curr = null;

        while (l1 != null || l2 != null){
            l1Val = l1 == null ? 0 : l1.val;
            l2Val = l2 == null ? 0 : l2.val;
            result = l1Val + l2Val + decade;
            decade = result / 10;
            unit = result % 10;

            ListNode tmp = new ListNode(unit);
            if (l3 == null){
                l3 = tmp;
            }

            if (curr == null){
                curr = tmp;
            }
            else {
                curr.next = tmp;
                curr = tmp;
            }

            l1 = l1==null ? null : l1.next;
            l2 = l2==null ? null : l2.next;
        }
        if (decade > 0){
            curr.next = new ListNode(decade);
        }

        return l3;
    }

    public int getValue(ListNode listNode){
        int value = 0;
        while (listNode != null){
            value = value * 10 + listNode.val;
            listNode = listNode.next;
        }
        return value;
    }
}
