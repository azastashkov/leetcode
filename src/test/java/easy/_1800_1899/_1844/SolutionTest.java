package easy._1800_1899._1844;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("abcdef", solution.replaceDigits("a1c1e1"));

        assertEquals("abbdcfdhe", solution.replaceDigits("a1b2c3d4e"));
    }
}
