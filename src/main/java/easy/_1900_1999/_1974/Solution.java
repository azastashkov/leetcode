package easy._1900_1999._1974;

public class Solution {
    public int minTimeToType(String word) {
        int l = word.length();
        int min = l;
        char p = 'a';
        for (int i = 0; i < l; i++) {
            char c = word.charAt(i);
            int d = Math.abs(p - c);
            min += Math.min(d, 26 - d);
            p = c;
        }

        return min;
    }
}