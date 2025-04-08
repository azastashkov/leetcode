package easy._0800_0899._0888;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1 = 0, s2 = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : aliceSizes) {
            s1 += i;
        }
        for (int i : bobSizes) {
            s2 += i;
            set.add(i);
        }

        int diff = (s1 - s2) >> 1;

        for (int a : aliceSizes) {
            int b = a - diff;
            if (set.contains(b)) {
                return new int[] { a, b };
            }
        }

        return null;
    }
}