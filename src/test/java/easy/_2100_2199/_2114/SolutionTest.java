package easy._2100_2199._2114;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.mostWordsFound(new String[] { "alice and bob love leetcode",
                "i think so too","this is great thanks very much" }));

        assertEquals(3, solution.mostWordsFound(new String[] { "please wait",
                "continue to fight", "continue to win" }));
    }
}
