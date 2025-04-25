package easy._1600_1699._1678;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Goal", solution.interpret("G()(al)"));

        assertEquals("Gooooal", solution.interpret("G()()()()(al)"));

        assertEquals("alGalooG", solution.interpret("(al)G(al)()()G"));
    }
}
