package easy._2000_2099._2078;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.maxDistance(new int[] { 1, 1, 1, 6, 1, 1, 1 }));

        assertEquals(4, solution.maxDistance(new int[] { 1, 8, 3, 8, 3 }));

        assertEquals(1, solution.maxDistance(new int[] { 0, 1 }));
    }
}
