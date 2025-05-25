package easy._2200_2299._2299;

public class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int l = password.length();
        if (l < 8) {
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
            return false;
        }

        for (int i = 1; i < l; i++) {
            if (password.charAt(i - 1) == password.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}