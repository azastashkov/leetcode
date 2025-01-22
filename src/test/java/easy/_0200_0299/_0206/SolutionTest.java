package easy._0200_0299._0206;

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

        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, toArray(solution.reverseList(head1)));

        ListNode head2 = fromArray(new int[] { 1, 2 });

        assertArrayEquals(new int[] { 2, 1 }, toArray(solution.reverseList(head2)));

        assertArrayEquals(new int[] {}, toArray(solution.reverseList(null)));
    }
}
