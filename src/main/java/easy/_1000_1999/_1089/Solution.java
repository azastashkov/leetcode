package easy._1000_1999._1089;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0) {
                for (int j = l - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}