package easy._2500_2599._2586;

public class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isVowelString(words[i])) {
                count++;
            }
        }

        return count;
    }

    private boolean isVowelString(String s) {
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1));
    }

    private boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}