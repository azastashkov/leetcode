package easy._1800_1899._1827;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.minOperations(new int[] { 1, 1, 1 }));

        assertEquals(14, solution.minOperations(new int[] { 1, 5, 2, 4, 1 }));

        assertEquals(0, solution.minOperations(new int[] { 8 }));
    }
}
