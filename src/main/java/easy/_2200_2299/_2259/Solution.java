package easy._2200_2299._2259;

import java.math.BigDecimal;

public class Solution {
    public String removeDigit(String number, char digit) {
        int fromIndex = 0, splitIndex, l = number.length();
        BigDecimal max = new BigDecimal(Integer.MIN_VALUE);
        while ((splitIndex = number.indexOf(digit, fromIndex)) >= 0) {
            fromIndex = splitIndex + 1;
            String s = number.substring(0, splitIndex) + number.substring(Math.min(fromIndex, l));
            BigDecimal n = new BigDecimal(s);
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }

        return max.toString();
    }
}