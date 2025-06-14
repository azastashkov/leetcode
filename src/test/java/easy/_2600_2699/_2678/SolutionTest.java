package easy._2600_2699._2678;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countSeniors(new String[] { "7868190130M7522", "5303914400F9211", "9273338290F4010" }));

        assertEquals(0, solution.countSeniors(new String[] { "1313579440F2036", "2921522980M5644" }));
    }
}
