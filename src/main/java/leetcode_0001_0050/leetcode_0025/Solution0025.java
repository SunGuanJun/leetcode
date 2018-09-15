package leetcode_0001_0050.leetcode_0025;

/**
 * 给定这个链表：1->2->3->4->5
 *
 *     当 k = 2 时，应当返回: 2->1->4->3->5
 *
 *     当 k = 3 时，应当返回: 3->2->1->4->5
 */
public class Solution0025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current=head, head2, start=head, finalHead = null, pre=null;
        int count=0;
        while (current != null){
            count++;
            current = current.next;
            if (count == k){
                head2 = reverse(start, k);
                if (pre != null){
                    pre.next = head2; // 连接翻转后的链表
                }
                pre = start;    // 翻转后 start就是最后一个节点了
                count = 0;
                start = current;
                if (finalHead == null){
                    finalHead = head2;
                }
            }
        }

        return finalHead == null ? head : finalHead;
    }


    public ListNode reverse(ListNode head, int k){
        ListNode current = head, head2 = null, current2=null;
        for (int i=0; i<k; i++){
            head2 = current;
            current = current.next;
            head2.next = current2;
            current2 = head2;
        }

        if (current != null){
            head.next = current;
        }

        return head2;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
