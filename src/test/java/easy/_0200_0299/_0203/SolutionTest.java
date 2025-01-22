package easy._0200_0299._0203;

import org.junit.Test;
import util.ListNode;

import static easy.util.ListNodeUtil.fromArray;
import static easy.util.ListNodeUtil.toArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        ListNode head1 = fromArray(new int[] { 1, 2, 6, 3, 4, 5, 6 });

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, toArray(solution.removeElements(head1, 6)));

        assertArrayEquals(new int[] {}, toArray(solution.removeElements(null, 1)));

        ListNode head3 = fromArray(new int[] { 7, 7, 7, 7 });

        assertArrayEquals(new int[] {}, toArray(solution.removeElements(head3, 7)));

        ListNode head4 = fromArray(new int[] { 1, 2, 2, 1 });

        assertArrayEquals(new int[] { 1, 1 }, toArray(solution.removeElements(head4, 2)));
    }
}
