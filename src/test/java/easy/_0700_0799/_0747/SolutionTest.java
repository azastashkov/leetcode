package easy._0700_0799._0747;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.dominantIndex(new int[] { 3, 6, 1, 0 }));

        assertEquals(-1, solution.dominantIndex(new int[] { 1, 2, 3, 4 }));

        assertEquals(2, solution.dominantIndex(new int[] { 0, 0, 2, 1 }));
    }
}
