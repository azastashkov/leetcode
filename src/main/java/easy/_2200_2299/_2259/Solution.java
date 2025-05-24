package easy._2200_2299._2259;

public class Solution {
    public String removeDigit(String number, char digit) {
        String s = "0";
        int l = number.length();
        for (int i = 0; i < l; i++) {
            char d = number.charAt(i);
            if (d == digit) {
                String t = number.substring(0, i) + number.substring(i + 1);
                if (s.compareTo(t) < 0) {
                    s = t;
                }
            }
        }

        return s;
    }
}