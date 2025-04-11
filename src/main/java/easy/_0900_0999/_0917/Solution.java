package easy._0900_0999._0917;

public class Solution {
    public String reverseOnlyLetters(String s) {
        int l = s.length();
        if (l < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        int i = 0, j = l - 1;
        while (i < j) {
            if (!Character.isLetter(chars[i])) {
                i++;
            } else if (!Character.isLetter(chars[j])) {
                j--;
            } else {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }
}