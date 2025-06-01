package easy._2300_2399._2347;

import java.util.Arrays;

public class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int s = suits[0], flush = 1;
        for (int i = flush; i < 5; i++) {
            if (s == suits[i]) {
                flush++;
            }
        }

        if (flush == 5) {
            return "Flush";
        }

        Arrays.sort(ranks);

        for (int i = 0; i < 3; i++) {
            if (ranks[i] == ranks[i + 1] && ranks[i + 1] == ranks[i + 2]) {
                return "Three of a Kind";
            }
        }

        for (int i = 0; i < 4; i++) {
            if (ranks[i] == ranks[i + 1]) {
                return "Pair";
            }
        }

        return "High Card";
    }
}