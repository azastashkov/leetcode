package easy._1700_1799._1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = word1.length();
        int k = word2.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < l || j < k; i++, j++) {
            if (i < l) {
                sb.append(word1.charAt(i));
            }
            if (j < k) {
                sb.append(word2.charAt(j));
            }
        }

        return sb.toString();
    }
}