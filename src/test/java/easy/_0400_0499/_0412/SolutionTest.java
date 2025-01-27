package easy._0400_0499._0412;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList("1", "2", "Fizz"), solution.fizzBuzz(3));

        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), solution.fizzBuzz(5));

        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), solution.fizzBuzz(15));
    }
}
