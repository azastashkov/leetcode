package easy._2100_2199._2124;

public class Solution {
    public boolean checkString(String s) {
        int l = s.length();
        int i = 0;
        for (; i < l; i++) {
            if (s.charAt(i) != 'a') {
                break;
            }
        }

        int j = l - 1;
        for (; j >= 0; j--) {
            if (s.charAt(j) != 'b') {
                break;
            }
        }

        return j < i;
    }
}