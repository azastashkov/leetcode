package easy._1400_1499._1408;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList("as", "hero"), solution.stringMatching(new String[] { "mass", "as", "hero", "superhero" }));

        assertEquals(Arrays.asList("et", "code"), solution.stringMatching(new String[] { "leetcode", "et", "code" }));

        assertEquals(Collections.emptyList(), solution.stringMatching(new String[] { "blue", "green", "bu" }));

        assertEquals(Arrays.asList("leetcode", "od", "am"), solution.stringMatching(new String[] { "leetcoder", "leetcode", "od", "hamlet", "am" }));
    }
}
