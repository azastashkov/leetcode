package easy._2200_2299._2269;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.divisorSubstrings(240, 2));

        assertEquals(2, solution.divisorSubstrings(430043, 2));
    }
}
