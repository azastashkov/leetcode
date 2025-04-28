package easy._1700_1799._1791;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] edges1 = new int[][] {
                { 1, 2 },
                { 2, 3 },
                { 4, 2 }
        };

        assertEquals(2, solution.findCenter(edges1));

        int[][] edges2 = new int[][] {
                { 1, 2 },
                { 5, 1 },
                { 1, 3 },
                { 1, 4 }
        };

        assertEquals(1, solution.findCenter(edges2));
    }
}
