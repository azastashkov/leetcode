package easy._2100_2199._2176;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.countPairs(new int[] { 3, 1, 2, 2, 2, 1, 3 }, 2));

        assertEquals(0, solution.countPairs(new int[] { 1, 2, 3, 4 }, 1));
    }
}
