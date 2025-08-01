package easy._3000_3099._3014;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.minimumPushes("abcde"));

        assertEquals(12, solution.minimumPushes("xycdefghij"));
    }
}
