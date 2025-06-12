package easy._2400_2499._2455;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.averageValue(new int[] { 1, 3, 6, 10, 12, 15 }));

        assertEquals(0, solution.averageValue(new int[] { 1, 2, 4, 7, 10 }));
    }
}
