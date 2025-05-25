package easy._2200_2299._2278;

public class Solution {
    public int percentageLetter(String s, char letter) {
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        return count * 100 / l;
    }
}