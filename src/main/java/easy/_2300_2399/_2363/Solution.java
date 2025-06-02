package easy._2300_2399._2363;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        merge(items1, treeMap);
        merge(items2, treeMap);

        List<List<Integer>> list = new ArrayList<>(treeMap.size());
        treeMap.forEach((k, v) -> list.add(List.of(k, v)));

        return list;
    }

    private void merge(int[][] items, TreeMap<Integer, Integer> treeMap) {
        for (int[] item : items) {
            int value = item[0];
            int weigth = item[1];
            treeMap.merge(value, weigth, Integer::sum);
        }
    }
}