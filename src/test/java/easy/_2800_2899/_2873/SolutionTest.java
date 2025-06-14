package easy._2800_2899._2873;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(77, solution.maximumTripletValue(new int[] { 12, 6, 1, 2, 7 }));

        assertEquals(133, solution.maximumTripletValue(new int[] { 1, 10, 3, 4, 19 }));

        assertEquals(0, solution.maximumTripletValue(new int[] { 1, 2, 3 }));
    }
}
