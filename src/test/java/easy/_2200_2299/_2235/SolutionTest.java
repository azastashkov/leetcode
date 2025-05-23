package easy._2200_2299._2235;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(17, solution.sum(12, 5));

        assertEquals(-6, solution.sum(-10, 4));
    }
}
