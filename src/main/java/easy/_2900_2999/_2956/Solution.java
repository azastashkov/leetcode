package easy._2900_2999._2956;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        int answer2 = 0;
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                answer2++;
            }
            set2.add(n);
        }

        int answer1 = 0;
        for (int n : nums1) {
            if (set2.contains(n)) {
                answer1++;
            }
        }

        return new int[] { answer1, answer2 };
    }
}