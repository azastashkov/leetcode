package easy._0001_0099._0067;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("100", solution.addBinary("11", "1"));

        assertEquals("10101", solution.addBinary("1010", "1011"));
    }
}
