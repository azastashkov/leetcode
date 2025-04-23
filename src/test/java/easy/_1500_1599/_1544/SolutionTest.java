package easy._1500_1599._1544;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("leetcode", solution.makeGood("leEeetcode"));

        assertEquals("", solution.makeGood("abBAcC"));

        assertEquals("s", solution.makeGood("s"));

        assertEquals("Hvh", solution.makeGood("Hvh"));
    }
}
