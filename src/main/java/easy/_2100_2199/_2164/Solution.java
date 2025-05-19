package easy._2100_2199._2164;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> odd = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>();

        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                nums[i] = even.remove();
            } else {
                nums[i] = odd.remove();
            }
        }

        return nums;
    }
}