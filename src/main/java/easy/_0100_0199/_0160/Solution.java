package easy._0100_0199._0160;

import util.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);
        ListNode pA = headA, pB = headB;

        if (sizeA > sizeB) {
            int d = sizeA - sizeB;
            do {
                pA = pA.next;
            } while (--d > 0);
        }

        if (sizeB > sizeA) {
            int d = sizeB - sizeA;
            do {
                pB = pB.next;
            } while (--d > 0);
        }

        while (pA != null || pB != null) {
            if (pA == pB) {
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }

        return null;
    }

    private int size(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
