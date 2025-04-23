package easy._1500_1599._1534;

public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a) {
                        if (Math.abs(arr[j] - arr[k]) <= b) {
                            if (Math.abs(arr[i] - arr[k]) <= c) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}