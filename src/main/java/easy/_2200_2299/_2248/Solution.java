package easy._2200_2299._2248;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001];
        for (var arr : nums) {
            for (int n : arr) {
                count[n]++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1001; i++) {
            if (count[i] == nums.length) {
                list.add(i);
            }
        }

        return list;
    }
}