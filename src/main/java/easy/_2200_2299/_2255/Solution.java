package easy._2200_2299._2255;

public class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String w : words) {
            if (s.startsWith(w)) {
                count++;
            }
        }

        return count;
    }
}