package easy._1000_1999._1030;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[][] { { 0, 0 }, { 0, 1 } },
                solution.allCellsDistOrder(1, 2, 0, 0));

        assertArrayEquals(new int[][] { { 0, 1 }, { 1,1 }, { 0, 0 }, { 1, 0 } },
                solution.allCellsDistOrder(2, 2, 0, 1));

        assertArrayEquals(new int[][] { { 1, 2 }, { 0, 2 }, { 1, 1 }, { 0, 1 }, { 1, 0 }, { 0, 0 } },
                solution.allCellsDistOrder(2, 3, 1, 2));
    }
}
