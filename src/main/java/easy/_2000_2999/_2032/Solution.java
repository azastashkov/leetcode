package easy._2000_2999._2032;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] count = new int[101];

        inc(count, nums1);
        inc(count, nums2);
        inc(count, nums3);

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            if (count[i] >= 2) {
                set.add(i);
            }
        }

        return new ArrayList<>(set);
    }

    private void inc(int[] count, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            if (set.add(n)) {
                count[n]++;
            }
        }
    }
}