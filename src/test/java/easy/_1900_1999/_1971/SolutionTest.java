package easy._1900_1999._1971;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] edges1 = new int[][] {
                { 0, 1 },
                { 1, 2 },
                { 2, 0 }
        };

        assertTrue(solution.validPath(3, edges1, 0, 2));

        int[][] edges2 = new int[][] {
                { 0, 1 },
                { 0, 2 },
                { 3, 5 },
                { 5, 4 },
                { 4, 3 }
        };

        assertFalse(solution.validPath(6, edges2, 0, 5));
    }
}
