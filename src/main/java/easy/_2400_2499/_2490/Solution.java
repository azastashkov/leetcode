package easy._2400_2499._2490;

public class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split("\\W+");
        int l = words.length;

        for (int i = 0; i < l; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[(i + 1) % l].charAt(0)) {
                return false;
            }
        }

        return true;
    }
}