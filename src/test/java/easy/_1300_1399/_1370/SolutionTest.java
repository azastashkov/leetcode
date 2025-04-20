package easy._1300_1399._1370;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("abccbaabccba", solution.sortString("aaaabbbbcccc"));

        assertEquals("art", solution.sortString("rat"));
    }
}
