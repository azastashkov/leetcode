package easy._0400_0499._0463;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] array1 = new int[][] {
                { 0, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 0, 1, 0, 0 },
                { 1, 1, 0, 0 }
        };
        assertEquals(16, solution.islandPerimeter(array1));

        int[][] array2 = new int[][] {
                { 1 }
        };
        assertEquals(4, solution.islandPerimeter(array2));

        int[][] array3 = new int[][] {
                { 1, 0 }
        };
        assertEquals(4, solution.islandPerimeter(array3));
    }
}
