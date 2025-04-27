package easy._1700_1799._1732;

public class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0, current = 0;
        for (int g : gain) {
            current += g;
            highest = Math.max(highest, current);
        }

        return highest;
    }
}