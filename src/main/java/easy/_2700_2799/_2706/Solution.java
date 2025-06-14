package easy._2700_2799._2706;

import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int price1 = prices[0];
        int price2 = prices[1];
        int total = price1 + price2;

        if (money >= total) {
            return total - money;
        }

        return money;
    }
}