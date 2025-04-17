package easy._1200_1299._1290;

import org.junit.Test;
import util.ListNode;

import static easy.util.ListNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        ListNode head1 = fromArray(new int[] { 1, 0, 1 });

        assertEquals(5, solution.getDecimalValue(head1));

        assertEquals(0, solution.getDecimalValue(null));
    }
}
