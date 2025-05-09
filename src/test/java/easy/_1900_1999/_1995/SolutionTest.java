package easy._1900_1999._1995;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.countQuadruplets(new int[] { 1, 2, 3, 6 }));

        assertEquals(0, solution.countQuadruplets(new int[] { 3, 3, 6, 4, 5 }));

        assertEquals(4, solution.countQuadruplets(new int[] { 1, 1, 1, 3, 5 }));
    }
}
