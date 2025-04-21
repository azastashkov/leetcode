package easy._1400_1499._1413;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.minStartValue(new int[] { -3, 2, -3, 4, 2 }));

        assertEquals(1, solution.minStartValue(new int[] { 1, 2 }));

        assertEquals(5, solution.minStartValue(new int[] { 1, -2, -3 }));
    }
}
