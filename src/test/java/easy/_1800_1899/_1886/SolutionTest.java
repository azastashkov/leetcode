package easy._1800_1899._1886;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] mat1 = new int[][] {
                { 0, 1 },
                { 1, 0 }
        };

        int[][] target1 = new int[][] {
                { 1, 0 },
                { 0, 1 }
        };

        assertTrue(solution.findRotation(mat1, target1));
    }
}
