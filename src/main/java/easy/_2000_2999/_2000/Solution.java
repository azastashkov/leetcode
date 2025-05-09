package easy._2000_2999._2000;

public class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx < 0) {
            return word;
        }

        StringBuilder sb = new StringBuilder();
        String prefix = word.substring(0, idx + 1);
        sb.append(prefix);

        return sb.reverse() + word.substring(idx + 1);
    }
}