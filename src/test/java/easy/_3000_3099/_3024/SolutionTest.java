package easy._3000_3099._3024;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("equilateral", solution.triangleType(new int[] { 3, 3, 3 }));

        assertEquals("scalene", solution.triangleType(new int[] { 3, 4, 5 }));

        assertEquals("none", solution.triangleType(new int[] { 5, 3, 8 }));

        assertEquals("isosceles", solution.triangleType(new int[] { 9, 4, 9 }));

        assertEquals("none", solution.triangleType(new int[] { 8, 4, 4 }));
    }
}
