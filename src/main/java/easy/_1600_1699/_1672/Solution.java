package easy._1600_1699._1672;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int banks = accounts[0].length;
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int b = 0; b < banks; b++) {
                wealth += account[b];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}