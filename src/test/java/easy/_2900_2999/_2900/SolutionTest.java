package easy._2900_2999._2900;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(List.of("c"), solution.getLongestSubsequence(new String[] { "c" }, new int[] { 0 }));

        assertEquals(List.of("d"), solution.getLongestSubsequence(new String[] { "d" }, new int[] { 1 }));
    }
}
