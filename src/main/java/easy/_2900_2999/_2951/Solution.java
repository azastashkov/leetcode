package easy._2900_2999._2951;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int l = mountain.length;
        if (l < 3) {
            return Collections.emptyList();
        }

        List<Integer> peaks = new ArrayList<>(l);
        for (int i = 1; i < l - 1; i++) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }

        return peaks;
    }
}