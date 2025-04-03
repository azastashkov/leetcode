package easy._0700_0799._0748;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("steps", solution.shortestCompletingWord("1s3 PSt",
                new String[] { "step", "steps", "stripe", "stepple" }));

        assertEquals("pest", solution.shortestCompletingWord("1s3 456",
                new String[] { "looks","pest","stew","show" }));
    }
}
