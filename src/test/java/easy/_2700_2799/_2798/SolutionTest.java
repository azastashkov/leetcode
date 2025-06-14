package easy._2700_2799._2798;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.numberOfEmployeesWhoMetTarget(new int[] { 0, 1, 2, 3, 4 }, 2));

        assertEquals(0, solution.numberOfEmployeesWhoMetTarget(new int[] { 5, 1, 4, 2, 2 }, 6));
    }
}
