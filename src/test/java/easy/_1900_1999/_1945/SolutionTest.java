package easy._1900_1999._1945;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(36, solution.getLucky("iiii", 1));

        assertEquals(6, solution.getLucky("leetcode", 2));

        assertEquals(8, solution.getLucky("zbax", 2));
    }
}
