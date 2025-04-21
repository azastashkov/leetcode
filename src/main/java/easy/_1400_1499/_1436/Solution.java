package easy._1400_1499._1436;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (var p : paths) {
            var a = p.get(0);
            set.add(a);
        }

        for (int i = 0; ; i++) {
            var b = paths.get(i).get(1);
            if (!set.contains(b)) {
                return b;
            }
        }
    }
}