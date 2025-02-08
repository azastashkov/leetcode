package easy._0500_0599._0599;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String[] array11 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] array12 = new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };

        assertArrayEquals(new String[] { "Shogun" }, solution.findRestaurant(array11, array12));

        String[] array21 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] array22 = new String[] { "KFC", "Shogun", "Burger King" };

        assertArrayEquals(new String[] { "Shogun" }, solution.findRestaurant(array21, array22));

        String[] array31 = new String[] { "happy", "sad", "good" };
        String[] array32 = new String[] { "sad", "happy", "good" };

        assertArrayEquals(new String[] { "sad", "happy" }, solution.findRestaurant(array31, array32));

        String[] array41 = new String[] { "S", "TEXP", "BK", "KFC" };
        String[] array42 = new String[] { "KFC", "BK", "S" };

        assertArrayEquals(new String[] { "S" }, solution.findRestaurant(array41, array42));
    }
}
