package easy._2300_2399._2325;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("this is a secret",
                solution.decodeMessage("the quick brown fox jumps over the lazy dog",
                        "vkbs bs t suepuv"));

        assertEquals("the five boxing wizards jump quickly",
                solution.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo",
                        "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
