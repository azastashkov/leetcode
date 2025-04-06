package easy._0800_0899._0830;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n = s.length();
        int i = 0;
        List<List<Integer>> res = new ArrayList<>();
        while (i < n) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            if (j - i >= 3) {
                res.add(List.of(i, j - 1));
            }
            i = j;
        }
        return res;
    }
}
