package easy._1300_1399._1309;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("jkab", solution.freqAlphabets("10#11#12"));

        assertEquals("acz", solution.freqAlphabets("1326#"));
    }
}
