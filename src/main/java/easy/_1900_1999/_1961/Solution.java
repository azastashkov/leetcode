package easy._1900_1999._1961;

public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (s.contentEquals(sb)) {
                return true;
            }
        }

        return false;
    }
}