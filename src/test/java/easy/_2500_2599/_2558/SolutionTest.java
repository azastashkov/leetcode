package easy._2500_2599._2558;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(29, solution.pickGifts(new int[] { 25, 64, 9, 4, 100 }, 4));

        assertEquals(4, solution.pickGifts(new int[] { 1, 1, 1, 1 }, 4));
    }
}
