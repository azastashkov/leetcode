package easy._2200_2299._2220;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.minBitFlips(10, 7));

        assertEquals(3, solution.minBitFlips(3, 4));
    }
}
