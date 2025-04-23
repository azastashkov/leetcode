package easy._1500_1599._1576;

public class Solution {
    public String modifyString(String s) {
        if ("?".equals(s)) {
            return "a";
        }

        int l = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < l; i++) {
            char c = chars[i];
            if (c == '?') {
                char left = i > 0 ? chars[i - 1] : 0;
                char right = i < l - 1 ? chars[i + 1] : 0;
                c = 'a';
                while (c == left || c == right) {
                    c = (char)(c + 1);
                }
                chars[i] = c;
            }
        }

        return new String(chars);
    }
}