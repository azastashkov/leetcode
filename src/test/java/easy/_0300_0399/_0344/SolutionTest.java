package easy._0300_0399._0344;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        char[] s1 = new char[] { 'h', 'e', 'l', 'l', 'o' };
        solution.reverseString(s1);

        assertArrayEquals(new char[] { 'o', 'l', 'l', 'e', 'h' }, s1);

        char[] s2 = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };
        solution.reverseString(s2);

        assertArrayEquals(new char[] { 'h', 'a', 'n', 'n', 'a', 'H' }, s2);
    }
}
