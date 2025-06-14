package easy._2800_2899._2894;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(19, solution.differenceOfSums(10, 3));

        assertEquals(15, solution.differenceOfSums(5, 6));

        assertEquals(-15, solution.differenceOfSums(5, 1));
    }
}
