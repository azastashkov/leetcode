package easy._2300_2399._2347;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Flush", solution.bestHand(new int[] { 13, 2, 3, 1, 9 }, new char[] { 'a', 'a', 'a', 'a', 'a' }));

        assertEquals("Three of a Kind", solution.bestHand(new int[] { 4, 4, 2, 4, 4 }, new char[] { 'd', 'a', 'a', 'b', 'c' }));

        assertEquals("Pair", solution.bestHand(new int[] { 10, 10, 2, 12, 9 }, new char[] { 'a', 'b', 'c', 'a', 'd' }));
    }
}
