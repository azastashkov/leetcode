package easy._2400_2499._2490;

public class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split("\\W+");
        int l = words.length;
        if (l == 1) {
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }

        for (int i = 1; i <= l - 1; i++) {
            String prev = words[i - 1];
            String curr = words[i];
            if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                return false;
            }
        }

        return words[0].charAt(0) == words[l - 1].charAt(words[l - 1].length() - 1);
    }
}