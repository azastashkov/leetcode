package easy._2200_2299._2215;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(List.of(1, 3), List.of(4, 6)),
                solution.findDifference(new int[] { 1, 2, 3 }, new int[] { 2, 4, 6 }));

        assertEquals(Arrays.asList(List.of(3), Collections.emptyList()),
                solution.findDifference(new int[] { 1, 2, 3, 3 }, new int[] { 1, 1, 2, 2 }));
    }
}
