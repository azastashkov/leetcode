package easy._1900_1999._1974;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.minTimeToType("abc"));

        assertEquals(7, solution.minTimeToType("bza"));

        assertEquals(34, solution.minTimeToType("zjpc"));
    }
}
