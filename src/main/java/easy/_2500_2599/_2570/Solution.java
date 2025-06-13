package easy._2500_2599._2570;

import java.util.TreeMap;

public class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int[] n : nums1) {
            int id = n[0];
            int val = n[1];
            treeMap.merge(id, val, Integer::sum);
        }

        for (int[] n : nums2) {
            int id = n[0];
            int val = n[1];
            treeMap.merge(id, val, Integer::sum);
        }

        int m = treeMap.size();
        int[][] arr = new int[m][2];
        int i = 0;
        var entries = treeMap.entrySet();
        for (var entry : entries) {
            arr[i][0] = entry.getKey();
            arr[i][1] = entry.getValue();
            i++;
        }

        return arr;
    }
}