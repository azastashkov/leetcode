package easy._2500_2599._2562;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(596, solution.findTheArrayConcVal(new int[] { 7, 52, 2, 4 }));

        assertEquals(673, solution.findTheArrayConcVal(new int[] { 5, 14, 13, 8, 12 }));
    }
}
