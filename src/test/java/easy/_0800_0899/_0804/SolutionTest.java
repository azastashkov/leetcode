package easy._0800_0899._0804;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));

        assertEquals(1, solution.uniqueMorseRepresentations(new String[] { "a" }));
    }
}
