package easy._0800_0899._0832;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] image1 = new int[][] {
                { 1, 1 ,0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        int[][] expected1 = new int[][] {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };

        assertArrayEquals(expected1, solution.flipAndInvertImage(image1));

        int[][] image2 = new int[][] {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 }
        };

        int[][] expected2 = new int[][] {
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 1 },
                { 1, 0, 1, 0 }
        };

        assertArrayEquals(expected2, solution.flipAndInvertImage(image2));
    }
}
