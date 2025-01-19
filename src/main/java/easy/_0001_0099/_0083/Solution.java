package easy._0001_0099._0083;

import util.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode c = head, n = c.next;
        while (n != null) {
            if (c.val == n.val) {
                c.next = n.next;
            } else {
                c = n;
            }
            n = n.next;
        }

        return head;
    }
}
