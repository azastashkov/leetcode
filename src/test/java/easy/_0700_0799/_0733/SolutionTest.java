package easy._0700_0799._0733;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] image = new int[][] {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int[][] expected = new int[][] {
                { 2, 2, 2 },
                { 2, 2, 0 },
                { 2, 0, 1 }
        };

        assertArrayEquals(expected, solution.floodFill(image, 1, 1, 2));
    }
}
