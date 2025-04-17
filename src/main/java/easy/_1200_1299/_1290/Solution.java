package easy._1200_1299._1290;

import util.ListNode;

public class Solution {
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        int n = 0;
        while (head != null) {
            n = n << 1 | head.val;
            head = head.next;
        }

        return n;
    }
}