package easy._0300_0399._0350;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] c1 = new int[1001];
        for (int i : nums1) {
            c1[i]++;
        }

        int[] c2 = new int[1001];
        for (int i : nums2) {
            c2[i]++;
        }

        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] > 0 && c2[i] > 0) {
                for (int j = 0; j < Math.min(c1[i], c2[i]); j++) {
                    l.add(i);
                }
            }
        }

        int[] res = new int[l.size()];
        int j = 0;
        for (int i : l) {
            res[j++] = i;
        }

        return res;
    }
}
