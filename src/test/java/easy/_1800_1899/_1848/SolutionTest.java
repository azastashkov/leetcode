package easy._1800_1899._1848;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.getMinDistance(new int[] { 1, 2, 3, 4, 5 }, 5, 3));

        assertEquals(0, solution.getMinDistance(new int[] { 1 }, 1, 0));

        assertEquals(0, solution.getMinDistance(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 1, 0));
    }
}
