package easy._2700_2799._2739;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(60, solution.distanceTraveled(5, 10));

        assertEquals(10, solution.distanceTraveled(1, 2));
    }
}
