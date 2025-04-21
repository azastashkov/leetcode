package easy._1300_1399._1394;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findLucky(new int[] { 2, 2, 3, 4 }));

        assertEquals(3, solution.findLucky(new int[] { 1, 2, 2, 3, 3, 3 }));

        assertEquals(-1, solution.findLucky(new int[] { 2, 2, 2, 3, 3 }));
    }
}