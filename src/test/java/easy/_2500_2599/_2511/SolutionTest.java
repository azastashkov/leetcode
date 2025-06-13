package easy._2500_2599._2511;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.captureForts(new int[] { 1, 0, 0, -1, 0, 0, 0, 0, 1 }));

        assertEquals(0, solution.captureForts(new int[] { 0, 0, 1, -1 }));
    }
}
