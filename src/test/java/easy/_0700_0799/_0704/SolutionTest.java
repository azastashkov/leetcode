package easy._0700_0799._0704;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));

        assertEquals(-1, solution.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
    }
}
