package easy._1900_1999._1984;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.minimumDifference(new int[] { 90 }, 1));

        assertEquals(2, solution.minimumDifference(new int[] { 9, 4, 1, 7 }, 2));
    }
}
