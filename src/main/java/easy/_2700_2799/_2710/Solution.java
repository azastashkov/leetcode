package easy._2700_2799._2710;

public class Solution {
    public String removeTrailingZeros(String num) {
        int l = num.length(), i = l - 1;
        for (; i >= 0; i--) {
            char c = num.charAt(i);
            if (c != '0') {
                break;
            }
        }

        return num.substring(0, i + 1);
    }
}