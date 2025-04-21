package easy._1300_1399._1389;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int l = nums.length;
        List<Integer> target = new LinkedList<>();
        for (int i = 0; i < l; i++) {
            int n = nums[i];
            int idx = index[i];
            target.add(idx, n);
        }

        int[] res = new int[l];
        for (int i = 0; i < l; ++i) {
            res[i] = target.get(i);
        }

        return res;
    }
}