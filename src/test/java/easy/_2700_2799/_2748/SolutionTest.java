package easy._2700_2799._2748;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.countBeautifulPairs(new int[] { 2, 5, 1, 4 }));

        assertEquals(2, solution.countBeautifulPairs(new int[] { 11, 21, 12 }));
    }
}
