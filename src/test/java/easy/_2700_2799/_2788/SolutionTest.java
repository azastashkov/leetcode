package easy._2700_2799._2788;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(List.of("one", "two", "three", "four", "five", "six"),
                solution.splitWordsBySeparator(List.of("one.two.three", "four.five", "six"), '.'));

        assertEquals(List.of("easy", "problem"),
                solution.splitWordsBySeparator(List.of("$easy$", "$problem$"), '$'));

        assertEquals(Collections.emptyList(),
                solution.splitWordsBySeparator(List.of("|||"), '|'));
    }
}
