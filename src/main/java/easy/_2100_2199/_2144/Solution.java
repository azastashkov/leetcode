package easy._2100_2199._2144;

import java.util.Arrays;

public class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int l = cost.length, minCost = 0, i = l - 1;
        while (i >= 1) {
            minCost += cost[i] + cost[i - 1];
            i -= 3;
        }

        if (i == 0) {
            minCost += cost[i];
        }

        return minCost;
    }
}