package easy._1000_1099._1021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("()()()", solution.removeOuterParentheses("(()())(())"));

        assertEquals("()()()()(())", solution.removeOuterParentheses("(()())(())(()(()))"));

        assertEquals("", solution.removeOuterParentheses("()()"));
    }
}
