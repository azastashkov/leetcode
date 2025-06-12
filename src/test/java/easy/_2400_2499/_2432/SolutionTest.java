package easy._2400_2499._2432;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] logs1 = new int[][] {
                { 0, 3 },
                { 2, 5 },
                { 0, 9 },
                { 1, 15 }
        };

        assertEquals(1, solution.hardestWorker(10, logs1));

        int[][] logs2 = new int[][] {
                { 1, 1 },
                { 3, 7 },
                { 2, 12 },
                { 7, 17 }
        };

        assertEquals(3, solution.hardestWorker(26, logs2));

        int[][] logs3 = new int[][] {
                { 0, 10 },
                { 1, 20 }
        };

        assertEquals(0, solution.hardestWorker(2, logs3));
    }
}
