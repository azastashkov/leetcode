package easy._0600_0699._0645;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int n : nums) {
            cnt.merge(n, 1, Integer::sum);
        }

        int[] out = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer c = cnt.get(i + 1);
            if (c == null) {
                out[1] = i + 1;
            }
            if (c != null && c > 1) {
                out[0] = i + 1;
            }
            if (out[0] > 0 && out[1] > 0) {
                break;
            }
        }

        return out;
    }
}
