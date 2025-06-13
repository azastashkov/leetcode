package easy._2500_2599._2586;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.vowelStrings(new String[] { "are", "amy", "u" }, 0, 2));

        assertEquals(3, solution.vowelStrings(new String[] { "hey", "aeo", "mu", "ooo", "artro" }, 1, 4));
    }
}
