package easy._2300_2399._2399;

import java.util.Arrays;

public class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] actualDistance = new int[26];
        Arrays.fill(actualDistance, -1);

        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int pos = c - 'a';
            if (actualDistance[pos] < 0) {
                actualDistance[pos] = i;
            } else {
                actualDistance[pos] = i - actualDistance[pos] - 1;
            }
        }

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int pos = c - 'a';
            if (actualDistance[pos] != distance[pos]) {
                return false;
            }
        }

        return true;
    }
}