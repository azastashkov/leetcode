package easy._1400_1499._1403;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);

        int l = nums.length, sum = 0;
        for (int n : nums) {
            sum += n;
        }

        List<Integer> list = new LinkedList<Integer>();
        int most = sum / 2, acc = 0;
        for (int i = l - 1; i >= 0; i--) {
            int n = nums[i];
            acc += n;
            list.add(n);
            if (acc > most) {
                break;
            }
        }

        return list;
    }
}