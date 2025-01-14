package easy._0013;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.romanToInt("III"));

        assertEquals(58, solution.romanToInt("LVIII"));

        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
