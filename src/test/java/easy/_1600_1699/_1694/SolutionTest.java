package easy._1600_1699._1694;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("123-456", solution.reformatNumber("1-23-45 6"));

        assertEquals("123-45-67", solution.reformatNumber("123 4-567"));

        assertEquals("123-456-78", solution.reformatNumber("123 4-5678"));
    }
}
