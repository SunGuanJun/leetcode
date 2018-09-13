package leetcode_0001_0050.leetcode_0019;


/**
 * Created by sun on 2018/9/13.
 */
public class Solution0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode n1=head, n2=head;
        for (int i=0; i<n; i++){
            n1 = n1.next;
        }

        if (n1 == null){
            return head.next;
        }
        while (n1.next != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        n2.next = n2.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
