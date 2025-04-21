package easy._1400_1499._1417;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("a0b1c2", solution.reformat("a0b1c2"));

        assertEquals("", solution.reformat("leetcode"));

        assertEquals("", solution.reformat("1229857369"));

        assertEquals("c2o0v1i9d", solution.reformat("covid2019"));
    }
}
