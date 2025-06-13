package easy._2600_2699._2644;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.maxDivScore(new int[] { 2, 9, 15, 50 }, new int[] { 5, 3, 7, 2 }));

        assertEquals(3, solution.maxDivScore(new int[] { 4, 7, 9, 3, 9 }, new int[] { 5, 2, 3 }));

        assertEquals(10, solution.maxDivScore(new int[] { 20, 14, 21, 10 }, new int[] { 10, 16, 20 }));
    }
}
