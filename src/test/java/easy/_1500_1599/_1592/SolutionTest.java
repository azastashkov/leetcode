package easy._1500_1599._1592;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("this   is   a   sentence", solution.reorderSpaces("  this   is  a sentence "));

        assertEquals("practice   makes   perfect ", solution.reorderSpaces(" practice   makes   perfect"));
    }
}
