package easy._1800_1899._1863;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.subsetXORSum(new int[] { 1, 3 }));

        assertEquals(28, solution.subsetXORSum(new int[] { 5, 1, 6 }));

        assertEquals(480, solution.subsetXORSum(new int[] { 3, 4, 5, 6, 7, 8 }));
    }
}
