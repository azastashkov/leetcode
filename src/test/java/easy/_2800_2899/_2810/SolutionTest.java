package easy._2800_2899._2810;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("rtsng", solution.finalString("string"));

        assertEquals("ponter", solution.finalString("poiinter"));
    }
}
