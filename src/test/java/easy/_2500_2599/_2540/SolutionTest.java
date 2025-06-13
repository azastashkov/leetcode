package easy._2500_2599._2540;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.getCommon(new int[] { 1, 2, 3 }, new int[] { 2, 4 }));

        assertEquals(2, solution.getCommon(new int[] { 1, 2, 3, 6 }, new int[] { 2, 3, 4, 5 }));
    }
}
