package easy._2200_2299._2231;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3412, solution.largestInteger(1234));

        assertEquals(87655, solution.largestInteger(65875));
    }
}
