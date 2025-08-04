package easy._3000_3099._3024;

import java.util.Arrays;

public class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a == c && b == c) {
            return "equilateral";
        } else if ((a == b || a == c || b == c) && a + b > c) {
            return "isosceles";
        } else if (a != b && a + b > c) {
            return "scalene";
        }

        return "none";
    }
}