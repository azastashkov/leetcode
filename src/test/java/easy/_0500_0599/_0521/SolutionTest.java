package easy._0500_0599._0521;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.findLUSlength("aba", "cdc"));

        assertEquals(3, solution.findLUSlength("aaa", "bbb"));

        assertEquals(-1, solution.findLUSlength("aaa", "aaa"));

        assertEquals(17, solution.findLUSlength("aefawfawfawfaw", "aefawfawfawfawaef"));
    }
}
