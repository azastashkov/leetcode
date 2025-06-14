package easy._2700_2799._2716;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.minimizedStringLength("aaabc"));

        assertEquals(3, solution.minimizedStringLength("cbbd"));

        assertEquals(4, solution.minimizedStringLength("baadccab"));
    }
}
