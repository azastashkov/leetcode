package easy._2300_2399._2389;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 3, 4 }, solution.answerQueries(new int[] { 4, 5, 2, 1 }, new int[] { 3, 10, 21 }));

        assertArrayEquals(new int[] { 0 }, solution.answerQueries(new int[] { 2, 3, 4, 5 }, new int[] { 1 }));
    }
}
