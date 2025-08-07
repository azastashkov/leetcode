package easy._3000_3099._3074;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.minimumBoxes(new int[] { 1, 3, 2 }, new int[] { 4, 3, 1, 5, 2 }));

        assertEquals(4, solution.minimumBoxes(new int[] { 5, 5, 5 }, new int[] { 2, 4, 2, 7 }));
    }
}
