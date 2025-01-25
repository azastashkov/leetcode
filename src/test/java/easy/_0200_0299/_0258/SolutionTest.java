package easy._0200_0299._0258;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.addDigits(38));

        assertEquals(0, solution.addDigits(0));
    }
}
