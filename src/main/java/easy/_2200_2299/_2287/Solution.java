package easy._2200_2299._2287;

public class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] scount = new int[26];
        int sl = s.length();
        for (int i = 0; i < sl; i++) {
            scount[s.charAt(i) - 'a']++;
        }

        int[] tcount = new int[26];
        int tl = target.length();
        for (int i = 0; i < tl; i++) {
            tcount[target.charAt(i) - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (tcount[i] > 0) {
                min = Math.min(min, scount[i] / tcount[i]);
            }
        }

        return min;
    }
}