package easy._1000_1099._1071;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));

        assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));

        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }
}
