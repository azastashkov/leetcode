package easy._2200_2299._2273;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {
    public List<String> removeAnagrams(String[] words) {
        int l = words.length;
        if (l <= 1) {
            return Arrays.asList(words);
        }

        for (int i = 1; i < l; i++) {
            if (isAnagram(words, i - 1, i)) {
                words[i] = words[i - 1];
                words[i - 1] = null;
            }
        }

        return Arrays.stream(words).filter(Objects::nonNull).collect(Collectors.toList());
    }

    private boolean isAnagram(String[] words, int i, int j) {
        int[] cnt = new int[26];
        String wi = words[i];
        int li = wi.length();
        for (int k = 0; k < li; k++) {
            cnt[wi.charAt(k) - 'a']++;
        }

        String wj = words[j];
        int lj = wj.length();
        for (int k = 0; k < lj; k++) {
            char cj = wj.charAt(k);
            cnt[cj - 'a']--;
        }

        for (int k = 0; k < 26; k++) {
            if (cnt[k] != 0) {
                return false;
            }
        }

        return true;
    }
}