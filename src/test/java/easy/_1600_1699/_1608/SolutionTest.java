package easy._1600_1699._1608;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.specialArray(new int[] { 3, 5 }));

        assertEquals(-1, solution.specialArray(new int[] { 0, 0 }));

        assertEquals(3, solution.specialArray(new int[] { 0, 4, 3, 0, 4 }));
    }
}
