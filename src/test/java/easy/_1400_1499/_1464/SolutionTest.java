package easy._1400_1499._1464;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(12, solution.maxProduct(new int[] { 3, 4, 5, 2 }));

        assertEquals(16, solution.maxProduct(new int[] { 1, 5, 4, 5 }));

        assertEquals(12, solution.maxProduct(new int[] { 3, 7 }));
    }
}
