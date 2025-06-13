package easy._2400_2499._2485;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.pivotInteger(8));

        assertEquals(1, solution.pivotInteger(1));

        assertEquals(-1, solution.pivotInteger(4));
    }
}
