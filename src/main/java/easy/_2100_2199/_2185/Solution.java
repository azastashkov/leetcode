package easy._2100_2199._2185;

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String w : words) {
            if (w.startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}