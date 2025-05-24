package easy._2200_2299._2259;

public class Solution {
    public String removeDigit(String number, char digit) {
        int fromIndex = 0, splitIndex = 0, l = number.length(), max = Integer.MIN_VALUE;
        while ((splitIndex = number.indexOf(digit, fromIndex)) >= 0) {
            fromIndex = splitIndex + 1;
            String s = number.substring(0, splitIndex) + number.substring(Math.min(fromIndex, l));
            int n = Integer.parseInt(s);
            max = Math.max(max, n);
        }

        return Integer.toString(max);
    }
}