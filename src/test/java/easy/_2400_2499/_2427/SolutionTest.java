package easy._2400_2499._2427;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.commonFactors(12, 6));

        assertEquals(2, solution.commonFactors(25, 30));
    }
}
