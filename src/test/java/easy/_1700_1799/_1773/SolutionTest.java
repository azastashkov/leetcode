package easy._1700_1799._1773;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<List<String>> items1 = Arrays.asList(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        assertEquals(1, solution.countMatches(items1, "color", "silver"));

        List<List<String>> items2 = Arrays.asList(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );

        assertEquals(2, solution.countMatches(items2, "type", "phone"));
    }
}
