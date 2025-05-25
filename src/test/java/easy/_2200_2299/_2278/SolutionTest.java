package easy._2200_2299._2278;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(33, solution.percentageLetter("foobar", 'o'));

        assertEquals(0, solution.percentageLetter("jjjj", 'k'));
    }
}
