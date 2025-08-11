package easy._3000_3099._3090;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.maximumLengthSubstring("bcbbbcba"));

        assertEquals(2, solution.maximumLengthSubstring("aaaa"));
    }
}
