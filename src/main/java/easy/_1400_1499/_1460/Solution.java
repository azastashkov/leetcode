package easy._1400_1499._1460;

import java.util.Arrays;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);

        return Arrays.equals(arr, target);
    }
}