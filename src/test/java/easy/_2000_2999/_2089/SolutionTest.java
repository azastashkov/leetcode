package easy._2000_2999._2089;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(1, 2), solution.targetIndices(new int[] { 1, 2, 5, 2, 3 }, 2));

        assertEquals(List.of(3), solution.targetIndices(new int[] { 1, 2, 5, 2, 3 }, 3));

        assertEquals(List.of(4), solution.targetIndices(new int[] { 1, 2, 5, 2, 3 }, 5));
    }
}
