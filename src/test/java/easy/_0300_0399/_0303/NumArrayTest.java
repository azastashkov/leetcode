package easy._0300_0399._0303;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumArrayTest {
    @Test
    public void test() {
        NumArray array = new NumArray(new int[] { -2, 0, 3, -5, 2, -1 });

        assertEquals(1, array.sumRange(0, 2));

        assertEquals(-1, array.sumRange(2, 5));

        assertEquals(-3, array.sumRange(0, 5));
    }
}
