package easy._1700_1799._1763;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("aAa", solution.longestNiceSubstring("YazaAay"));

        assertEquals("Bb", solution.longestNiceSubstring("Bb"));

        assertEquals("", solution.longestNiceSubstring("c"));
    }
}
