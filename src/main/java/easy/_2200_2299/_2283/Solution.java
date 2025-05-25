package easy._2200_2299._2283;

public class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10];
        int l = num.length();
        for (int i = 0; i < l; i++) {
            count[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < l; i++) {
            if (count[i] != (num.charAt(i) - '0')) {
                return false;
            }
        }

        return true;
    }
}