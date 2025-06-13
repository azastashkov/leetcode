package easy._2400_2499._2481;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.numberOfCuts(4));

        assertEquals(3, solution.numberOfCuts(3));
    }
}
