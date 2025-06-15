package easy._2900_2999._2960;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countTestedDevices(new int[] { 1, 1, 2, 1, 3 }));

        assertEquals(2, solution.countTestedDevices(new int[] { 0, 1, 2 }));
    }
}
