package easy._1700_1799._1700;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.countStudents(new int[] { 1, 1, 0, 0 }, new int[] { 0, 1, 0, 1 }));

        assertEquals(3, solution.countStudents(new int[] { 1, 1, 1, 0, 0, 1 }, new int[] { 1, 0, 0, 0, 1, 1 }));
    }
}
