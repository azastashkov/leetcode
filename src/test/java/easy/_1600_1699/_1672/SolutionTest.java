package easy._1600_1699._1672;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] accounts1 = new int[][] {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        assertEquals(6, solution.maximumWealth(accounts1));

        int[][] accounts2 = new int[][] {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };

        assertEquals(10, solution.maximumWealth(accounts2));

        int[][] accounts3 = new int[][] {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 }
        };

        assertEquals(17, solution.maximumWealth(accounts3));
    }
}
