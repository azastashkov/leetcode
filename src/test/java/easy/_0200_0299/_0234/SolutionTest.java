package easy._0200_0299._0234;

import org.junit.Test;
import util.ListNode;

import static easy.util.ListNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        ListNode head1 = fromArray(new int[] { 1, 2, 2, 1 });

        assertTrue(solution.isPalindrome(head1));

        ListNode head2 = fromArray(new int[] { 1, 2 });

        assertFalse(solution.isPalindrome(head2));
    }
}
