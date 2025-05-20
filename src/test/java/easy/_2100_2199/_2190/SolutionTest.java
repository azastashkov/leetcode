package easy._2100_2199._2190;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(100, solution.mostFrequent(new int[] { 1, 100, 200, 1, 100 }, 1));

        assertEquals(2, solution.mostFrequent(new int[] { 2, 2, 2, 2, 3 }, 2));
    }
}
