package easy._2300_2399._2315;

public class Solution {
    public int countAsterisks(String s) {
        int verticalBarCount = 0, asterisksCount = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '*' && verticalBarCount % 2 == 0) {
                asterisksCount++;
            }
            if (c == '|') {
                verticalBarCount++;
            }
        }

        return asterisksCount;
    }
}