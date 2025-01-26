package easy._0300_0399._0389;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals('e', solution.findTheDifference("abcd", "abcde"));

        assertEquals('y', solution.findTheDifference("", "y"));
    }
}
