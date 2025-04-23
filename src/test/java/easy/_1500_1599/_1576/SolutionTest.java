package easy._1500_1599._1576;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("azs", solution.modifyString("?zs"));

        assertEquals("ubvaw", solution.modifyString("ubv?w"));

        assertEquals("a", solution.modifyString("?"));
    }
}
