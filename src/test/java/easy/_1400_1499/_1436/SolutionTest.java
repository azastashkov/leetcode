package easy._1400_1499._1436;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<List<String>> paths1 = List.of(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );

        assertEquals("Sao Paulo", solution.destCity(paths1));

        List<List<String>> paths2 = List.of(
                Arrays.asList("B", "C"),
                Arrays.asList("D", "B"),
                Arrays.asList("C", "A")
        );

        assertEquals("A", solution.destCity(paths2));

        List<List<String>> paths3 = List.of(
                Arrays.asList("A", "Z")
        );

        assertEquals("Z", solution.destCity(paths3));
    }
}
