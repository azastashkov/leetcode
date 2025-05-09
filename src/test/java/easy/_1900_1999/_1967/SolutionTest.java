package easy._1900_1999._1967;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.numOfStrings(new String[] { "a", "abc", "bc", "d" }, "abc"));

        assertEquals(2, solution.numOfStrings(new String[] { "a", "b", "c" }, "aaaaabbbbb"));

        assertEquals(3, solution.numOfStrings(new String[] { "a", "a", "a" }, "ab"));
    }
}
