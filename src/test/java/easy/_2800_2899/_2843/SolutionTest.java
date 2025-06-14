package easy._2800_2899._2843;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.countSymmetricIntegers(1, 100));

        assertEquals(4, solution.countSymmetricIntegers(1200, 1230));
    }
}
