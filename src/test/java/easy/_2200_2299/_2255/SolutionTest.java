package easy._2200_2299._2255;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countPrefixes(
                new String[] { "a", "b", "c", "ab", "bc", "abc" }, "abc"));

        assertEquals(2, solution.countPrefixes(new String[] { "a", "a" }, "aa"));
    }
}
