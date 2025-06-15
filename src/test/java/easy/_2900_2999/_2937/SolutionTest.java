package easy._2900_2999._2937;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findMinimumOperations("abc", "abb", "ab"));

        assertEquals(-1, solution.findMinimumOperations("dac", "bac", "cac"));
    }
}
