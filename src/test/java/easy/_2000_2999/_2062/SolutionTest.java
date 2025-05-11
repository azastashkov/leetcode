package easy._2000_2999._2062;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countVowelSubstrings("aeiouu"));

        assertEquals(0, solution.countVowelSubstrings("unicornarihan"));

        assertEquals(7, solution.countVowelSubstrings("cuaieuouac"));
    }
}
