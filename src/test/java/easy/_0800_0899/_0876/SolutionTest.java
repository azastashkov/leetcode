package easy._0800_0899._0876;

import org.junit.Test;
import util.ListNode;

import static easy.util.ListNodeUtil.fromArray;
import static easy.util.ListNodeUtil.toArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        ListNode head1 = fromArray(new int[] { 1, 2, 3, 4, 5 });

        assertArrayEquals(new int[] { 3, 4, 5 }, toArray(solution.middleNode(head1)));

        ListNode head2 = fromArray(new int[] { 1, 2, 3, 4, 5, 6 });

        assertArrayEquals(new int[] { 4, 5, 6 }, toArray(solution.middleNode(head2)));
    }
}
