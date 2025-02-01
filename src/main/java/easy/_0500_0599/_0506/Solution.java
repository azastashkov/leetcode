package easy._0500_0599._0506;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        if (score.length == 0) {
            return new String[] {};
        }

        Comparator<Integer> comparator = Integer::compare;
        Queue<Integer> heap = new PriorityQueue<>(comparator.reversed());
        for (int s : score) {
            heap.add(s);
        }

        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        while (!heap.isEmpty()) {
            Integer v = heap.remove();
            if (i == 0) {
                map.put(v, "Gold Medal");
            } else if (i == 1) {
                map.put(v, "Silver Medal");
            } else if (i == 2) {
                map.put(v, "Bronze Medal");
            } else {
                map.put(v, Integer.toString(i + 1));
            }
            i++;
        }

        String[] out = new String[score.length];
        i = 0;
        for (; i < score.length; i++) {
            out[i] = map.get(score[i]);
        }

        return out;
    }
}
