package easy._2100_2199._2180;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countEven(4));

        assertEquals(14, solution.countEven(30));
    }
}
