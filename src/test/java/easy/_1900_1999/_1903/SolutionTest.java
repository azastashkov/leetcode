package easy._1900_1999._1903;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("5", solution.largestOddNumber("52"));

        assertEquals("", solution.largestOddNumber("4206"));

        assertEquals("35427", solution.largestOddNumber("35427"));
    }
}
