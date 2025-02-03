package easy._0500_0599._0557;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));

        assertEquals("rM gniD", solution.reverseWords("Mr Ding"));
    }
}
