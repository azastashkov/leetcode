package easy._0100_0199._0121;

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;

        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }

        return max;
    }
}