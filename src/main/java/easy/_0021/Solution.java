package easy._0021;

import util.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode r = new ListNode();
        if (list1.val <= list2.val) {
            r.val = list1.val;
            list1 = list1.next;
        } else {
            r.val = list2.val;
            list2 = list2.next;
        }

        ListNode h = r;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                r.next = list1;
                list1 = list1.next;
            } else {
                r.next = list2;
                list2 = list2.next;
            }
            r = r.next;
        }

        if (list1 != null) {
            r.next = list1;
        }

        if (list2 != null) {
            r.next = list2;
        }

        return h;
    }
}
