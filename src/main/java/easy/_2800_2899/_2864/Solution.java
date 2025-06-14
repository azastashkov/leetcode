package easy._2800_2899._2864;

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        int l = s.length(), onesCount = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                onesCount++;
            }
        }

        return "1".repeat(Math.max(0, onesCount - 1)) +
                "0".repeat(Math.max(0, l - onesCount)) +
                '1';
    }
}