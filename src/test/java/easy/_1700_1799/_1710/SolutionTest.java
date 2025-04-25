package easy._1700_1799._1710;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] boxTypes1 = new int[][] {
                { 1, 3 },
                { 2, 2 },
                { 3, 1 }
        };

        assertEquals(8, solution.maximumUnits(boxTypes1, 4));

        int[][] boxTypes2 = new int[][] {
                { 5, 10 },
                { 2, 5 },
                { 4, 7 },
                { 3, 9 }
        };

        assertEquals(91, solution.maximumUnits(boxTypes2, 10));
    }
}
