package easy._0300_0399._0345;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("AceCreIm", solution.reverseVowels("IceCreAm"));

        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}
