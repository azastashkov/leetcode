package easy._2000_2999._2047;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countValidWords("cat and  dog"));

        assertEquals(0, solution.countValidWords("!this  1-s b8d!"));

        assertEquals(5, solution.countValidWords("alice and  bob are playing stone-game10"));

        assertEquals(1, solution.countValidWords("a"));

        assertEquals(1, solution.countValidWords("!"));
    }
}
