package easy._2500_2599._2525;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Heavy", solution.categorizeBox(1000, 35, 700, 300));

        assertEquals("Neither", solution.categorizeBox(200, 50, 800, 50));

        assertEquals("Both", solution.categorizeBox(2909, 3968, 3272, 727));
    }
}
