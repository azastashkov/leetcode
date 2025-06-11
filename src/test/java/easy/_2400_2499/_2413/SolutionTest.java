package easy._2400_2499._2413;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(10, solution.smallestEvenMultiple(5));

        assertEquals(6, solution.smallestEvenMultiple(6));
    }
}
