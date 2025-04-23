package easy._1500_1599._1560;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int m = rounds.length - 1;
        List<Integer> list = new ArrayList<>();
        if (rounds[0] <= rounds[m]) {
            for (int i = rounds[0]; i <= rounds[m]; i++) {
                list.add(i);
            }
        } else {
            for (int i = 1; i <= rounds[m]; i++) {
                list.add(i);
            }
            for (int i = rounds[0]; i <= n; i++) {
                list.add(i);
            }
        }

        return list;
    }
}