package easy._0900_0999._0941;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int l = arr.length;
        if (l < 3) {
            return false;
        }

        int i = 0;
        while (i + 1 < l - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        int j = l - 1;
        while (j - 1 > 0 && arr[j - 1] > arr[j]) {
            j--;
        }

        return i == j;
    }
}