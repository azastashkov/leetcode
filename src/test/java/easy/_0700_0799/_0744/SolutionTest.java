package easy._0700_0799._0744;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals('c', solution.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'a'));

        assertEquals('f', solution.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'c'));

        assertEquals('x', solution.nextGreatestLetter(new char[] { 'x', 'x', 'y', 'y' }, 'z'));
    }
}
