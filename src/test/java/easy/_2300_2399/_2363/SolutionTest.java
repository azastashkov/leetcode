package easy._2300_2399._2363;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] items11 = new int[][] {
                { 1, 1 },
                { 4, 5 },
                { 3, 8 }
        };

        int[][] items12 = new int[][] {
                { 3, 1 },
                { 1, 5 }
        };

        assertEquals(Arrays.asList(List.of(1, 6), List.of(3, 9), List.of(4, 5)), solution.mergeSimilarItems(items11, items12));

        int[][] items21 = new int[][] {
                { 1, 1 },
                { 3, 2 },
                { 2, 3 }
        };

        int[][] items22 = new int[][] {
                { 2, 1 },
                { 3, 2 },
                { 1, 3 }
        };

        assertEquals(Arrays.asList(List.of(1, 4), List.of(2, 4), List.of(3, 4)), solution.mergeSimilarItems(items21, items22));

        int[][] items31 = new int[][] {
                { 1, 3 },
                { 2, 2 }
        };

        int[][] items32 = new int[][] {
                { 7, 1 },
                { 2, 2 },
                { 1, 4 }
        };

        assertEquals(Arrays.asList(List.of(1, 7), List.of(2, 4), List.of(7, 1)), solution.mergeSimilarItems(items31, items32));
    }
}
