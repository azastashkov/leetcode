package easy._0002;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 7, 0, 8 }, toArray(solution.addTwoNumbers(
                fromArray(new int[] { 2, 4, 3 }), fromArray(new int[] { 5, 6, 4 })
        )));

        assertArrayEquals(new int[] { 0 }, toArray(solution.addTwoNumbers(
                fromArray(new int[] { 0 }), fromArray(new int[] { 0 })
        )));

        assertArrayEquals(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 }, toArray(solution.addTwoNumbers(
                fromArray(new int[] { 9, 9, 9, 9, 9, 9, 9 }), fromArray(new int[] { 9, 9, 9, 9 })
        )));
    }

    private ListNode insert(ListNode root, int value) {
        ListNode temp = new ListNode(value);
        temp.next = root;
        root = temp;
        return root;
    }

    private int size(ListNode root) {
        ListNode current = root;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    private ListNode fromArray(int[] values) {
        ListNode root = null;
        for (int i = values.length - 1; i >= 0; i--) {
            root = insert(root, values[i]);
        }
        return root;
    }

    private int[] toArray(ListNode root) {
        int[] array = new int[size(root)];
        ListNode current = root;
        int i = 0;
        while (current != null) {
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }
}
