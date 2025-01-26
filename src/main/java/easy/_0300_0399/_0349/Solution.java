package easy._0300_0399._0349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }

        Set<Integer> s2 = new HashSet<>();
        for (int i : nums2) {
            if (s1.contains(i)) {
                s2.add(i);
            }
        }

        int[] res = new int[s2.size()];
        int j = 0;
        for (int i : s2) {
            res[j++] = i;
        }

        return res;
    }
}
