package easy._1500_1599._1550;

public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int l = arr.length;
        if (l < 3) {
            return false;
        }

        for (int i = 2; i < l; i++) {
            if (arr[i - 2] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i] % 2 == 1) {
                return true;
            }
        }

        return false;
    }
}