package easy._1400_1499._1422;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.maxScore("011101"));

        assertEquals(5, solution.maxScore("00111"));

        assertEquals(3, solution.maxScore("1111"));
    }
}
