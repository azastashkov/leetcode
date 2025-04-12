package easy._0900_0999._0961;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.repeatedNTimes(new int[] { 1, 2, 3, 3 }));

        assertEquals(2, solution.repeatedNTimes(new int[] { 2, 1, 2, 5, 3, 2 }));

        assertEquals(5, solution.repeatedNTimes(new int[] { 5, 1, 5, 2, 5, 3, 5, 4 }));
    }
}
