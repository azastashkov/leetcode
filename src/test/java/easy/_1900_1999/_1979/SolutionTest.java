package easy._1900_1999._1979;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findGCD(new int[] { 2, 5, 6, 9, 10 }));

        assertEquals(1, solution.findGCD(new int[] { 7, 5, 6, 8, 3 }));

        assertEquals(3, solution.findGCD(new int[] { 3, 3 }));
    }
}
