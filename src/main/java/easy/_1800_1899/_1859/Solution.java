package easy._1800_1899._1859;

public class Solution {
    public String sortSentence(String s) {
        String[] words1idx = s.split(" ");
        String[] words = new String[words1idx.length];
        for (String w : words1idx) {
            int splitPos = w.length() - 1;
            int idx = Integer.parseInt(w.substring(splitPos));
            words[idx - 1] = w.substring(0, splitPos);
        }

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append(" ");
        }

        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}