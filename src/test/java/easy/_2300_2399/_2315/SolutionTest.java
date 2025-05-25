package easy._2300_2399._2315;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countAsterisks("l|*e*et|c**o|*de|"));

        assertEquals(0, solution.countAsterisks("iamprogrammer"));

        assertEquals(5, solution.countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}
