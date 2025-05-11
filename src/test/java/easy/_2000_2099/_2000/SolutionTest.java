package easy._2000_2099._2000;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("dcbaefd", solution.reversePrefix("abcdefd", 'd'));

        assertEquals("zxyxxe", solution.reversePrefix("xyxzxe", 'z'));

        assertEquals("abcd", solution.reversePrefix("abcd", 'z'));
    }
}
