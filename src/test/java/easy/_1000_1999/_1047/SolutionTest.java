package easy._1000_1999._1047;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("ca", solution.removeDuplicates("abbaca"));

        assertEquals("ay", solution.removeDuplicates("azxxzy"));
    }
}
