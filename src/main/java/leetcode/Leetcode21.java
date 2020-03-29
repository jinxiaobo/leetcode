package leetcode;

/**
 * Created by jinxiaobo on 2020/3/28.
 */
public class Leetcode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l3 = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l1 = l1.next;
                l3 = l3.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        if (l1 == null) {
            l3.next = l2;
        } else if (l2 == null) {
            l3.next = l1;
        }
        return result.next;
    }
}
