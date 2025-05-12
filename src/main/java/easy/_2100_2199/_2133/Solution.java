package easy._2100_2199._2133;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkValid(int[][] matrix) {
        final int n = matrix.length;
        final Set<Integer> fact = fact(n);

        for (int r = 0; r < n; r++) {
            Set<Integer> set = new HashSet<>(fact);
            for (int c = 0; c < n; c++) {
                set.remove(matrix[r][c]);
            }

            if (!set.isEmpty()) {
                return false;
            }
        }

        for (int c = 0; c < n; c++) {
            Set<Integer> set = new HashSet<>(fact);
            for (int r = 0; r < n; r++) {
                set.remove(matrix[r][c]);
            }

            if (!set.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    private Set<Integer> fact(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }

        return set;
    }
}