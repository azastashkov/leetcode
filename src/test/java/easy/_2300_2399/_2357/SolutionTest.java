package easy._2300_2399._2357;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.minimumOperations(new int[] { 1, 5, 0, 3, 5 }));

        assertEquals(0, solution.minimumOperations(new int[] { 0 }));
    }
}
