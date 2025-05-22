package easy._2200_2299._2224;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.convertTime("02:30", "04:35"));

        assertEquals(1, solution.convertTime("11:00", "11:01"));
    }
}
