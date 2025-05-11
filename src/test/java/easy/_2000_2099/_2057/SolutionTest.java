package easy._2000_2099._2057;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.smallestEqual(new int[] { 0, 1, 2 }));

        assertEquals(2, solution.smallestEqual(new int[] { 4, 3, 2, 1 }));

        assertEquals(-1, solution.smallestEqual(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }));
    }
}
