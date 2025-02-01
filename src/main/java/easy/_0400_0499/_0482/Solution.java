package easy._0400_0499._0482;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        int j = 0;

        for (int i = l - 1; i >= 0; i--) {
            char c = Character.toUpperCase(s.charAt(i));
            if (c != '-' && j < k) {
                sb.append(c);
                j++;
            } else if (i > 0 && j >= k) {
                sb.append('-');
                if (c != '-') {
                    sb.append(c);
                    j = 1;
                } else {
                    j = 0;
                }
            } else if (i == 0 && c != '-') {
                sb.append('-');
                sb.append(c);
            }
        }

        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }
}
