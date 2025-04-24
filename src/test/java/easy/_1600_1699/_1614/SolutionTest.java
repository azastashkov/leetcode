package easy._1600_1699._1614;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.maxDepth("(1+(2*3)+((8)/4))+1"));

        assertEquals(3, solution.maxDepth("(1)+((2))+(((3)))"));

        assertEquals(3, solution.maxDepth("()(())((()()))"));
    }
}
