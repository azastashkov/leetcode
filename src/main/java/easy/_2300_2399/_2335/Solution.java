package easy._2300_2399._2335;

import java.util.Arrays;

public class Solution {
    public int fillCups(int[] amount) {
        int min = 0;
        while (amount[0] + amount[1] + amount[2] > 0) {
            Arrays.sort(amount);
            min++;
            amount[2]--;
            amount[1] = Math.max(0, amount[1] - 1);
        }
        return min;
    }
}