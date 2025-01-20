package easy.util;

import util.ListNode;

public class ListNodeUtil {
    public static ListNode insert(ListNode root, int value) {
        ListNode temp = new ListNode(value);
        temp.next = root;
        root = temp;
        return root;
    }

    public static int size(ListNode root) {
        ListNode current = root;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static ListNode fromArray(int[] values) {
        ListNode root = null;
        for (int i = values.length - 1; i >= 0; i--) {
            root = insert(root, values[i]);
        }
        return root;
    }

    public static int[] toArray(ListNode root) {
        int[] array = new int[size(root)];
        ListNode current = root;
        int i = 0;
        while (current != null) {
            array[i++] = current.val;
            current = current.next;
        }
        return array;
    }

    public static ListNode tail(ListNode head) {
        ListNode current = head;
        if (current == null) {
            return null;
        }

        while (current.next != null) {
            current = current.next;
        }

        return current;
    }
}
