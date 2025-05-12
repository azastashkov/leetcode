package easy._2100_2199._2129;

public class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() <= 2) {
                sb.append(w.toLowerCase()).append(" ");
            } else {
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1).toLowerCase());
                sb.append(" ");
            }
        }

        sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}