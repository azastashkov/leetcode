package easy._0200_0299._0234;

import util.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow, previous = null;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }

        while (previous != null) {
            if (head.val != previous.val) {
                return false;
            }
            previous = previous.next;
            head = head.next;
        }

        return true;
    }
}
