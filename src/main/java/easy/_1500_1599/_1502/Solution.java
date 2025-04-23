package easy._1500_1599._1502;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0], l = arr.length;
        for (int i = 2; i < l; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }
}