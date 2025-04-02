package easy._0700_0799._0728;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertEquals(list1, solution.selfDividingNumbers(1, 22));

        List<Integer> list2 = Arrays.asList(48, 55, 66, 77);
        assertEquals(list2, solution.selfDividingNumbers(47, 85));
    }
}
