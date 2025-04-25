package easy._1600_1699._1684;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] alwd = new char[26];
        int l = allowed.length();
        for (int i = 0; i < l; i++) {
            alwd[allowed.charAt(i) - 'a']++;
        }

        int count = 0;
        for (String w : words) {
            int k = w.length();
            int consistent = 0;
            for (int i = 0; i < k; i++) {
                if (alwd[w.charAt(i) - 'a'] == 0) {
                    break;
                }
                consistent++;
            }

            if (consistent == k) {
                count++;
            }
        }

        return count;
    }
}