package easy._1100_1199._1128;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.numEquivDominoPairs(new int[][] { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } }));

        assertEquals(3, solution.numEquivDominoPairs(new int[][] { { 1, 2 }, { 1, 2 }, { 1, 1 }, { 1, 2 }, { 2, 2 } }));
    }
}
