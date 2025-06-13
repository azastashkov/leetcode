package easy._2400_2499._2465;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.distinctAverages(new int[] { 4, 1, 4, 0, 3, 5 }));

        assertEquals(1, solution.distinctAverages(new int[] { 1, 100 }));
    }
}
