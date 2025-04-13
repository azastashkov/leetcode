package easy._1000_1999._1018;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(true, false, false), solution.prefixesDivBy5(new int[] { 0, 1, 1 }));

        assertEquals(Arrays.asList(false, false, false), solution.prefixesDivBy5(new int[] { 1, 1, 1 }));
    }
}
