package easy._2100_2199._2169;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countOperations(2, 3));

        assertEquals(1, solution.countOperations(10, 10));
    }
}
