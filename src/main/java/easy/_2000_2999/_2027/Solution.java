package easy._2000_2999._2027;

public class Solution {
    public int minimumMoves(String s) {
        int l = s.length(), i = 0, count = 0;
        while (i < l) {
            char c = s.charAt(i);
            if (c == 'X') {
                i += 2;
                count++;
            }
            i++;
        }

        return count;
    }
}