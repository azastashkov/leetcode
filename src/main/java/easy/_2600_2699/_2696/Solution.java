package easy._2600_2699._2696;

public class Solution {
    public int minLength(String s) {
        boolean ok;
        do {
            ok = false;
            if (s.contains("AB")) {
                s = s.replace("AB", "");
                ok = true;
            } else if (s.contains("CD")) {
                s = s.replace("CD", "");
                ok = true;
            }
        } while (ok);

        return s.length();
    }
}