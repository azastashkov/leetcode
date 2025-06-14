package easy._2600_2699._2682;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 4, 5 }, solution.circularGameLosers(5, 2));

        assertArrayEquals(new int[] { 2, 3, 4 }, solution.circularGameLosers(4, 4));
    }
}
