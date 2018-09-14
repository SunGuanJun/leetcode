package leetcode_0001_0050.leetcode_0021;


public class Solution0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=null, l3i= new ListNode(0);

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                l3i.next = l1;
                l1 = l1.next;
            }
            else {
                l3i.next = l2;
                l2 = l2.next;
            }
            l3i = l3i.next;
            l3i.next = null;
            if (l3 == null){
                l3 = l3i;
            }
        }
        if (l1 != null){
            l3i.next = l1;
        }
        if (l2 != null){
            l3i.next = l2;
        }

        return l3;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
