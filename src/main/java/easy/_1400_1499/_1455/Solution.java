package easy._1400_1499._1455;

public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int l = words.length;
        for (int i = 0; i < l; i++) {
            String w = words[i];
            if (w.startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}