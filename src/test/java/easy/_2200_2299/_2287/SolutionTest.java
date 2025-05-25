package easy._2200_2299._2287;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.rearrangeCharacters("ilovecodingonleetcode", "code"));

        assertEquals(1, solution.rearrangeCharacters("abcba", "abc"));

        assertEquals(1, solution.rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }
}
