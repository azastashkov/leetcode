package easy._2500_2599._2535;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.differenceOfSum(new int[] { 1, 15, 6, 3 }));

        assertEquals(0, solution.differenceOfSum(new int[] { 1, 2, 3, 4 }));
    }
}
