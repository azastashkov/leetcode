package easy._2500_2599._2520;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.countDigits(7));

        assertEquals(2, solution.countDigits(121));

        assertEquals(4, solution.countDigits(1248));
    }
}
