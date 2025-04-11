package easy._0900_0999._0944;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.minDeletionSize(new String[] { "cba", "daf", "ghi" }));

        assertEquals(0, solution.minDeletionSize(new String[] { "a", "b" }));

        assertEquals(3, solution.minDeletionSize(new String[] { "zyx", "wvu", "tsr" }));

        assertEquals(2, solution.minDeletionSize(new String[] { "rrjk", "furt", "guzm" }));
    }
}
