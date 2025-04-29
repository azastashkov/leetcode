package easy._1800_1899._1816;

public class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]).append(" ");
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}