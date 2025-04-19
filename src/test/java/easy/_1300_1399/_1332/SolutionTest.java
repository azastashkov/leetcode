package easy._1300_1399._1332;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.removePalindromeSub("ababa"));

        assertEquals(2, solution.removePalindromeSub("abb"));

        assertEquals(2, solution.removePalindromeSub("baabb"));
    }
}
