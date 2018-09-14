package leetcode_0001_0050.leetcode_0024;

/**
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class Solution0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode n1=null, n2=null, current=head,pre=null;
        while (current != null){
            if (n1 == null){
                n1 = current;
                current = current.next;
            }
            else {
                n2 = current;
                if (n1 == head){
                    head = n2;
                }
                current = current.next;

                n1.next = n2.next;
                n2.next = n1;
                if (pre !=null){
                    pre.next = n2;
                }
                pre = n1;
                n1 =null;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
