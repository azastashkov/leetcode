package easy._0500_0599._0599;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> ml1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            ml1.put(list1[i], i);
        }

        List<String> out = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            Integer i = ml1.get(list2[j]);
            if (i != null) {
                if (i + j < min) {
                    min = i + j;
                    out.clear();
                    out.add(list2[j]);
                } else if (i + j == min) {
                    out.add(list2[j]);
                }
            }
        }

        String[] array = new String[out.size()];
        out.toArray(array);

        return array;
    }
}
