package easy._2500_2599._2570;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] exp1 = new int[][] {
                { 1, 6 },
                { 2, 3 },
                { 3, 2 },
                { 4, 6 }
        };

        int[][] nums11 = new int[][] {
                { 1, 2 },
                { 2, 3 },
                { 4, 5 }
        };

        int[][] nums12 = new int[][] {
                { 1, 4 },
                { 3, 2 },
                { 4, 1 }
        };

        assertArrayEquals(exp1, solution.mergeArrays(nums11, nums12));

        int[][] exp2 = new int[][] {
                { 1, 3 },
                { 2, 4 },
                { 3, 6 },
                { 4, 3 },
                { 5, 5 }
        };

        int[][] nums21 = new int[][] {
                { 2, 4 },
                { 3, 6 },
                { 5, 5 }
        };

        int[][] nums22 = new int[][] {
                { 1, 3 },
                { 4, 3 }
        };

        assertArrayEquals(exp2, solution.mergeArrays(nums21, nums22));
    }
}
