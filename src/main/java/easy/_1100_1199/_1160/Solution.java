package easy._1100_1199._1160;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        int cl = chars.length();
        for (int i = 0; i < cl; i++) {
            char c = chars.charAt(i);
            count[c - 'a']++;
        }

        int sum = 0;
        for (String w : words) {
            int wl = w.length();
            int[] wc = new int[26];
            boolean good = true;
            for (int i = 0; i < wl; i++) {
                char c = w.charAt(i);
                int j = c - 'a';
                if (++wc[j] > count[j]) {
                    good = false;
                    break;
                }
            }

            if (good) {
                sum += wl;
            }
        }

        return sum;
    }
}