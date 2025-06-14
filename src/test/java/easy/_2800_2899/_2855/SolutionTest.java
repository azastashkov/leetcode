package easy._2800_2899._2855;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.minimumRightShifts(List.of(3, 4, 5, 1, 2)));

        assertEquals(0, solution.minimumRightShifts(List.of(1, 3, 5)));

        assertEquals(-1, solution.minimumRightShifts(List.of(2, 1, 4)));
    }
}
