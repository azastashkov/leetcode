package easy._2200_2299._2259;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("12", solution.removeDigit("123", '3'));

        assertEquals("231", solution.removeDigit("1231", '1'));

        assertEquals("51", solution.removeDigit("551", '5'));

        assertEquals("299858953917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471",
                solution.removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471", '3'));
    }
}
