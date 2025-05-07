package easy._1900_1999._1913;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(34, solution.maxProductDifference(new int[] { 5, 6, 2, 7, 4 }));

        assertEquals(64, solution.maxProductDifference(new int[] { 4, 2, 5, 9, 7, 4, 8 }));
    }
}
