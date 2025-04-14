package easy._1100_1199._1108;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));

        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr("255.100.50.0"));
    }
}
