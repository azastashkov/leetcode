package easy._1300_1399._1309;

public class Solution {
    public String freqAlphabets(String s) {
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ((int) 'a' + i);
        }

        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = l - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                int a = (int) s.charAt(--i) - (int) '0';
                int b = (int) s.charAt(--i) - (int) '0';
                int idx = b * 10 + a - 1;
                sb.append(chars[idx]);
            } else {
                sb.append(chars[(int) c - (int) '0' - 1]);
            }
        }

        return sb.reverse().toString();
    }
}