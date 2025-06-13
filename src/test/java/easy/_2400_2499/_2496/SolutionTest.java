package easy._2400_2499._2496;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.maximumValue(new String[] { "alic3", "bob", "3", "4", "00000" }));

        assertEquals(1, solution.maximumValue(new String[] { "1", "01", "001", "0001" }));
    }
}
