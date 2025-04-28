package easy._1700_1799._1758;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.minOperations("0100"));

        assertEquals(0, solution.minOperations("10"));

        assertEquals(2, solution.minOperations("1111"));

        assertEquals(3, solution.minOperations("10010100"));
    }
}
