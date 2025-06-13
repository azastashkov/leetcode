package easy._2500_2599._2566;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(99009, solution.minMaxDifference(11891));

        assertEquals(99, solution.minMaxDifference(90));
    }
}
