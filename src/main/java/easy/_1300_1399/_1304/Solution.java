package easy._1300_1399._1304;

public class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 1, j = 0; i <= n / 2; i++) {
            arr[j++] = i;
            arr[j++] = -i;
        }

        return arr;
    }
}