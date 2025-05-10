package easy._2000_2999._2032;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(2, 3), solution.twoOutOfThree(new int[] { 1, 1, 3, 2 },
                new int[] { 2, 3 }, new int[] { 3 }));

        assertEquals(Arrays.asList(1, 2, 3), solution.twoOutOfThree(new int[] { 3, 1 },
                new int[] { 2, 3 }, new int[] { 1, 2 }));

        assertEquals(Collections.emptyList(), solution.twoOutOfThree(new int[] { 1, 2, 2 },
                new int[] { 4, 3, 3 }, new int[] { 5 }));
    }
}
