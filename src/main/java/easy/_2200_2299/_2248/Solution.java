package easy._2200_2299._2248;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Solution {
    public List<Integer> intersection(int[][] nums) {
        int l = nums.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int[] arr : nums) {
            for (int n : arr) {
                treeMap.merge(n, 1, Integer::sum);
            }
        }

        List<Integer> list = new LinkedList<>();
        treeMap.forEach((k, v) -> {
            if (v == l) {
                list.add(k);
            }
        });

        return list;
    }
}