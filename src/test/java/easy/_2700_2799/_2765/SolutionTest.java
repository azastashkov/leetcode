package easy._2700_2799._2765;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.alternatingSubarray(new int[] { 2, 3, 4, 3, 4 }));

        assertEquals(2, solution.alternatingSubarray(new int[] { 4, 5, 6 }));
    }
}
