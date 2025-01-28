package easy._0400_0499._0448;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] c = new int[nums.length + 1];

        for (int i : nums) {
            c[i]++;
        }

        List<Integer> res = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (c[i] == 0) {
                res.add(i);
            }
        }

        return res;
    }
}
