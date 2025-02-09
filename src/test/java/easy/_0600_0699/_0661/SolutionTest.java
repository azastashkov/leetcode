package easy._0600_0699._0661;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] input1 = new int[][] {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        int[][] output1 = new int[][] {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };

        assertArrayEquals(output1, solution.imageSmoother(input1));

        int[][] input2 = new int[][] {
                { 100, 200, 100 },
                { 200, 50, 200 },
                { 100, 200, 100 }
        };

        int[][] output2 = new int[][] {
                { 137, 141, 137 },
                { 141, 138, 141 },
                { 137, 141, 137 }
        };

        assertArrayEquals(output2, solution.imageSmoother(input2));
    }
}
