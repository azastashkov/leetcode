package easy._2100_2199._2148;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countElements(new int[] { 11, 7, 2, 15 }));

        assertEquals(2, solution.countElements(new int[] { -3, 3, 3, 90 }));
    }
}
