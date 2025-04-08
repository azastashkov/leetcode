package easy._0800_0899._0884;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new String[] { "sour", "sweet" }, solution.uncommonFromSentences("this apple is sweet", "this apple is sour"));

        assertArrayEquals(new String[] { "banana" }, solution.uncommonFromSentences("apple apple", "banana"));
    }
}
