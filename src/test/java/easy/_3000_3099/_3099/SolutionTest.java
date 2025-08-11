package easy._3000_3099._3099;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.sumOfTheDigitsOfHarshadNumber(18));

        assertEquals(-1, solution.sumOfTheDigitsOfHarshadNumber(23));
    }
}
