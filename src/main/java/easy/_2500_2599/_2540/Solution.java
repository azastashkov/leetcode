package easy._2500_2599._2540;

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int k = nums2.length;

        int i = 0, j = 0;
        while (i < l && j < k) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }

            if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return -1;
    }
}