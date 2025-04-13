package easy._0900_0999._0997;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findJudge(2, new int[][] { { 1, 2 } }));

        assertEquals(3, solution.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 } }));

        assertEquals(-1, solution.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 }, { 3, 1 } }));
    }
}
