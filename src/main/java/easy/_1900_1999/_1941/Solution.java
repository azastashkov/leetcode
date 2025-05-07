package easy._1900_1999._1941;

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        int l = s.length();
        int max = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            count[idx]++;
            max = Math.max(max, count[idx]);
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0 && count[i] != max) {
                return false;
            }
        }

        return true;
    }
}