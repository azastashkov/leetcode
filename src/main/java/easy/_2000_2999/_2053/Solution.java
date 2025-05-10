package easy._2000_2999._2053;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            map.merge(s, 1, Integer::sum);
        }

        int count = 0;
        var entries = map.entrySet();
        for (var entry : entries) {
            int v = entry.getValue();
            if (v == 1) {
                if (++count == k) {
                    return entry.getKey();
                }
            }
        }

        return "";
    }
}