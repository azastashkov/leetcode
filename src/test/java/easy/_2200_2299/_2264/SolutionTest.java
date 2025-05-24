package easy._2200_2299._2264;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("777", solution.largestGoodInteger("6777133339"));

        assertEquals("000", solution.largestGoodInteger("2300019"));

        assertEquals("", solution.largestGoodInteger("42352338"));
    }
}
