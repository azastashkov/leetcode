package easy._1900_1999._1991;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.findMiddleIndex(new int[] { 2, 3, -1, 8, 4 }));

        assertEquals(2, solution.findMiddleIndex(new int[] { 1, -1, 4 }));

        assertEquals(-1, solution.findMiddleIndex(new int[] { 2, 5 }));

        assertEquals(0, solution.findMiddleIndex(new int[] { 1 }));

        assertEquals(0, solution.findMiddleIndex(new int[] { 4, 0 }));
    }
}
