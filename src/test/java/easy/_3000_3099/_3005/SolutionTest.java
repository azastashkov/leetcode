package easy._3000_3099._3005;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.maxFrequencyElements(new int[] { 1, 2, 2, 3, 1, 4 }));

        assertEquals(5, solution.maxFrequencyElements(new int[] { 1, 2, 3, 4, 5 }));
    }
}
