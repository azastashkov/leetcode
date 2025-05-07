package easy._1900_1999._1935;

public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int l = brokenLetters.length();
        int count = words.length;
        for (String word : words) {
            for (int i = 0; i < l; i++) {
                char c = brokenLetters.charAt(i);
                if (word.indexOf(c) >= 0) {
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}