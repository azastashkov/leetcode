package easy._0500_0599._0500;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new String[] { "Alaska", "Dad" },
                solution.findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" }));

        assertArrayEquals(new String[] {}, solution.findWords(new String[] { "omk" }));

        assertArrayEquals(new String[] { "adsdf", "sfd" }, solution.findWords(new String[] { "adsdf", "sfd" }));
    }
}
