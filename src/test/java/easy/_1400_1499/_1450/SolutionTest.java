package easy._1400_1499._1450;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.busyStudent(new int[] { 1, 2, 3 }, new int[] { 3, 2, 7 }, 4));

        assertEquals(1, solution.busyStudent(new int[] { 4 }, new int[] { 4 }, 4));
    }
}
