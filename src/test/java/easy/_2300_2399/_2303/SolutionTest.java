package easy._2300_2399._2303;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] brackets1 = new int[][] {
                { 3, 50 },
                { 7, 10 },
                { 12, 25 }
        };

        assertEquals(2.65, solution.calculateTax(brackets1, 10), 0.00001);

        int[][] brackets2 = new int[][] {
                { 1, 0 },
                { 4, 25 },
                { 5, 50 }
        };

        assertEquals(0.25, solution.calculateTax(brackets2, 2), 0.00001);

        int[][] brackets3 = new int[][] {
                { 2, 50 }
        };

        assertEquals(0, solution.calculateTax(brackets3, 0), 0.00001);
    }
}
