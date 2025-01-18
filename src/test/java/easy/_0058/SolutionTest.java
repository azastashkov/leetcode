package easy._0058;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.lengthOfLastWord("Hello World"));

        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));

        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
