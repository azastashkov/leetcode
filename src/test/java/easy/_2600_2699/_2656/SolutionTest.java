package easy._2600_2699._2656;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(18, solution.maximizeSum(new int[] { 1, 2, 3, 4, 5 }, 3));

        assertEquals(11, solution.maximizeSum(new int[] { 5, 5, 5 }, 2));
    }
}
