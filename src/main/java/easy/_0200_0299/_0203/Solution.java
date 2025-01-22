package easy._0200_0299._0203;

import util.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode new_head = head;
        while (new_head != null && new_head.val == val) {
            new_head = new_head.next;
        }

        ListNode current = new_head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return new_head;
    }
}
