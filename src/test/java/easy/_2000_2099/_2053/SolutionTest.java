package easy._2000_2099._2053;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("a", solution.kthDistinct(new String[] { "d", "b", "c", "b", "c", "a" }, 2));

        assertEquals("aaa", solution.kthDistinct(new String[] { "aaa", "aa", "a" }, 1));

        assertEquals("", solution.kthDistinct(new String[] { "a", "b", "a" }, 3));
    }
}
