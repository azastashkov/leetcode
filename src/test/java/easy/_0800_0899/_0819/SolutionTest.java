package easy._0800_0899._0819;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("ball", solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] { "hit" }));

        assertEquals("bob", solution.mostCommonWord("Bob!", new String[] { "hit" }));

        assertEquals("a", solution.mostCommonWord("a.", new String[] {}));

        assertEquals("ball", solution.mostCommonWord("Bob. hIt, baLl", new String[] { "bob", "hit" }));
    }
}
