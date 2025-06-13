package easy._2500_2599._2553;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] separateDigits(int[] nums) {
        int l = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = l - 1; i >= 0; i--) {
            int n = nums[i];
            while (n > 0) {
                int r = n % 10;
                stack.push(r);
                n /= 10;
            }
        }

        int[] answer = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            answer[i++] = stack.pop();
        }

        return answer;
    }
}