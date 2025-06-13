package easy._2500_2599._2544;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.alternateDigitSum(521));

        assertEquals(1, solution.alternateDigitSum(111));

        assertEquals(0, solution.alternateDigitSum(886996));
    }
}
