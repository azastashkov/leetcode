package easy._0700_0799._0771;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));

        assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
    }
}
