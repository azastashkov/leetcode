package easy._0100_0199._0141;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        ListNode node11 = new ListNode(3);
        ListNode node12 = new ListNode(2);
        node11.next = node12;
        ListNode node13 = new ListNode(0);
        node12.next = node13;
        ListNode node14 = new ListNode(-4);
        node13.next = node14;
        node14.next = node12;

        assertTrue(solution.hasCycle(node11));

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(2);
        node21.next = node22;
        node22.next = node21;

        assertTrue(solution.hasCycle(node21));

        ListNode node31 = new ListNode(1);

        assertFalse(solution.hasCycle(node31));

        assertFalse(solution.hasCycle(null));
    }
}
