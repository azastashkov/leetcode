package easy._2800_2899._2864;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("001", solution.maximumOddBinaryNumber("010"));

        assertEquals("1001", solution.maximumOddBinaryNumber("0101"));
    }
}
