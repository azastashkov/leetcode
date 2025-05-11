package easy._2100_2199._2103;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Solution {
    public int countPoints(String rings) {
        int l = rings.length();
        int n = l / 2;
        Set[] arr = Stream.generate(() -> new HashSet())
                .limit(10)
                .toArray(HashSet[]::new);

        for (int i = 0; i < l; i += 2) {
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);
            arr[rod - '0'].add(color);
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i].size() == 3) {
                count++;
            }
        }

        return count;
    }
}