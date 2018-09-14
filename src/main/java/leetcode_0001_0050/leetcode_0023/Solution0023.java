package leetcode_0001_0050.leetcode_0023;

/**
 *  输入:
 *     [
 *       1->4->5,
 *       1->3->4,
 *       2->6
 *     ]
 *     输出: 1->1->2->3->4->4->5->6
 */
public class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode l=null, li = new ListNode(0), tmp;
        int index=0;

        while (true){
            tmp = null;
            for (int i=0; i<lists.length; i++){
                if (lists[i] != null){
                    if (tmp == null || lists[i].val < tmp.val){
                        tmp = lists[i];
                        index = i;
                    }
                }
            }
            if (tmp == null){
                break;
            }
            else {
                li.next = tmp;
                li = li.next;
                tmp = tmp.next;
                lists[index] = tmp;
                if (l == null){
                    l = li;
                }
            }
        }
        return l;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
