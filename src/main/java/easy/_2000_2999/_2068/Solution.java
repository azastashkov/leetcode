package easy._2000_2999._2068;

public class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = charFrequency(word1);
        int[] freq2 = charFrequency(word2);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > 0 || freq2[i] > 0) {
                max = Math.max(max, Math.abs(freq1[i] - freq2[i]));
            }
        }

        return max <= 3;
    }

    private int[] charFrequency(String word) {
        int l = word.length();
        int[] freq = new int[26];
        for (int i = 0; i < l; i++) {
            char c = word.charAt(i);
            freq[c - 'a']++;
        }

        return freq;
    }
}