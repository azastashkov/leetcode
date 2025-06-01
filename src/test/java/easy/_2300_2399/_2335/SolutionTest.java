package easy._2300_2399._2335;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.fillCups(new int[] { 1, 4, 2 }));

        assertEquals(7, solution.fillCups(new int[] { 5, 4, 4 }));

        assertEquals(5, solution.fillCups(new int[] { 5, 0, 0 }));
    }
}
