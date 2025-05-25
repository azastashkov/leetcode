package easy._2300_2399._2309;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("E", solution.greatestLetter("lEeTcOdE"));

        assertEquals("R", solution.greatestLetter("arRAzFif"));

        assertEquals("", solution.greatestLetter("AbCdEfGhIjK"));
    }
}
