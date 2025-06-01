package easy._2300_2399._2351;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals('c', solution.repeatedCharacter("abccbaacz"));

        assertEquals('d', solution.repeatedCharacter("abcdd"));
    }
}
