package easy._0100_0199._0160;

import org.junit.Test;
import util.ListNode;

import static easy.util.ListNodeUtil.fromArray;
import static easy.util.ListNodeUtil.tail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        ListNode head1A = fromArray(new int[] { 4, 1 });
        ListNode head1B = fromArray(new int[] { 5, 6, 1 });
        ListNode common1A1B = fromArray(new int[] { 8, 4, 5 });

        ListNode tail1A = tail(head1A);
        if (tail1A != null) {
            tail1A.next = common1A1B;
        }

        ListNode tail1B = tail(head1B);
        if (tail1B != null) {
            tail1B.next = common1A1B;
        }

        ListNode intersection1A1B = solution.getIntersectionNode(head1A, head1B);

        assertEquals(8, intersection1A1B.val);

        ListNode head2A = fromArray(new int[] { 1, 9, 1 });
        ListNode head2B = fromArray(new int[] { 3 });
        ListNode common2A2B = fromArray(new int[] { 2, 4 });

        ListNode tail2A = tail(head2A);
        if (tail2A != null) {
            tail2A.next = common2A2B;
        }

        ListNode tail2B = tail(head2B);
        if (tail2B != null) {
            tail2B.next = common2A2B;
        }

        ListNode intersection2A2B = solution.getIntersectionNode(head2A, head2B);

        assertEquals(2, intersection2A2B.val);

        ListNode head3A = fromArray(new int[] { 2, 6, 4 });
        ListNode head3B = fromArray(new int[] { 1, 5 });

        assertNull(solution.getIntersectionNode(head3A, head3B));
    }
}
