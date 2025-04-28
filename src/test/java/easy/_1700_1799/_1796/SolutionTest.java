package easy._1700_1799._1796;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.secondHighest("dfa12321afd"));

        assertEquals(-1, solution.secondHighest("abc1111"));
    }
}
