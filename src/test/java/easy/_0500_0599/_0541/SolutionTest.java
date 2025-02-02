package easy._0500_0599._0541;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("bacdfeg", solution.reverseStr("abcdefg", 2));

        assertEquals("bacd", solution.reverseStr("abcd", 2));
    }
}
