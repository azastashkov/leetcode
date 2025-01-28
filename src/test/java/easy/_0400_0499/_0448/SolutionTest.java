package easy._0400_0499._0448;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(5, 6), solution.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));

        assertEquals(Collections.singletonList(2), solution.findDisappearedNumbers(new int[] { 1, 1 }));
    }
}
