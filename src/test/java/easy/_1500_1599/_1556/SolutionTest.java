package easy._1500_1599._1556;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("987", solution.thousandSeparator(987));

        assertEquals("1.234", solution.thousandSeparator(1234));

        assertEquals("0", solution.thousandSeparator(0));
    }
}
