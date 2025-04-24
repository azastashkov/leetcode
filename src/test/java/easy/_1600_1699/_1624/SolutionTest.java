package easy._1600_1699._1624;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.maxLengthBetweenEqualCharacters("aa"));

        assertEquals(2, solution.maxLengthBetweenEqualCharacters("abca"));

        assertEquals(-1, solution.maxLengthBetweenEqualCharacters("cbzxy"));
    }
}
