package easy._2400_2499._2404;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.mostFrequentEven(new int[] { 0, 1, 2, 2, 4, 4, 1 }));

        assertEquals(4, solution.mostFrequentEven(new int[] { 4, 4, 4, 9, 2, 4 }));

        assertEquals(-1, solution.mostFrequentEven(new int[] { 29, 47, 21, 41, 13, 37, 25, 7 }));
    }
}
