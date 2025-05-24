package easy._2200_2299._2243;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("135", solution.digitSum("11111222223", 3));

        assertEquals("000", solution.digitSum("00000000", 3));

        assertEquals("37", solution.digitSum("1234", 2));
    }
}
