package easy._0400_0499._0401;

import java.util.List;
import java.util.LinkedList;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new LinkedList<>();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int m = Integer.bitCount(i);
                int n = Integer.bitCount(j);
                if (m + n == turnedOn) {
                    res.add(String.format("%d:%02d", i, j));
                }
            }
        }

        return res;
    }
}
