package easy._2400_2499._2469;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new double[] { 309.65000, 97.70000 }, solution.convertTemperature(36.50), 0.0001);

        assertArrayEquals(new double[] { 395.26000, 251.79800 }, solution.convertTemperature(122.11), 0.0001);
    }
}
