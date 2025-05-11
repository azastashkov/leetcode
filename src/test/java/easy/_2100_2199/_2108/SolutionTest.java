package easy._2100_2199._2108;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("ada", solution.firstPalindrome(new String[] { "abc","car","ada","racecar","cool" }));

        assertEquals("racecar", solution.firstPalindrome(new String[] { "notapalindrome", "racecar" }));

        assertEquals("", solution.firstPalindrome(new String[] { "def", "ghi" }));
    }
}
