package easy._0900_0999._0925;

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length(), n = typed.length();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }

            int x = i;
            while (x < m && name.charAt(i) == name.charAt(x)) {
                x++;
            }

            int y = j;
            while (y < n && typed.charAt(j) == typed.charAt(y)) {
                y++;
            }

            if (x - i > y - j) {
                return false;
            }

            i = x;
            j = y;
        }

        return i == m && j == n;
    }
}