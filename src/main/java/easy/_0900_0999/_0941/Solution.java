package easy._0900_0999._0941;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int l = arr.length;
        if (l < 3) {
            return false;
        }

        if (arr[0] >= arr[1]) {
            return false;
        }

        boolean peak = false;
        for (int i = 1; i < l; i++) {
            if (!peak && arr[i - 1] < arr[i]) {
                continue;
            } else if (!peak && arr[i - 1] > arr[i]) {
                peak = true;
                continue;
            }

            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }

        return peak;
    }
}