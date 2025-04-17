package easy._1200_1299._1287;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.findSpecialInteger(new int[] { 1, 2, 2, 6, 6, 6, 6, 7, 10 }));

        assertEquals(1, solution.findSpecialInteger(new int[] { 1, 1 }));
    }
}
