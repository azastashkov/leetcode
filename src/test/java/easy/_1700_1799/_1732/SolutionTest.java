package easy._1700_1799._1732;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.largestAltitude(new int[] { -5, 1, 5, 0, -7 }));

        assertEquals(0, solution.largestAltitude(new int[] { -4, -3, -2, -1, 4, 3, 2 }));
    }
}
