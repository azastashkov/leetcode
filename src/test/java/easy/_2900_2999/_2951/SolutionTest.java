package easy._2900_2999._2951;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Collections.emptyList(), solution.findPeaks(new int[] { 2, 4, 4 }));

        assertEquals(List.of(1, 3), solution.findPeaks(new int[] { 1, 4, 3, 8, 5 }));
    }
}
