package easy._1700_1799._1791;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            map.merge(u, 1, Integer::sum);
            map.merge(v, 1, Integer::sum);
        }

        Optional<Map.Entry<Integer, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        return maxEntry.get().getKey();
    }
}