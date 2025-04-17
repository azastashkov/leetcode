package easy._1200_1299._1287;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] == arr[i + l / 4]) {
                return arr[i];
            }
        }

        return 0;
    }
}
