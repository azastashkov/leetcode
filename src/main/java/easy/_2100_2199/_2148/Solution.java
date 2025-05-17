package easy._2100_2199._2148;

import java.util.TreeMap;

public class Solution {
    public int countElements(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int n : nums) {
            treeMap.merge(n, 1, Integer::sum);
        }

        int i = 0, size = treeMap.size(), total = 0;
        var entries = treeMap.entrySet();
        for (var entry : entries) {
            if (i > 0 && i < size - 1) {
                total += entry.getValue();
            }
            i++;
        }

        return total;
    }
}