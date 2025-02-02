package easy._0500_0599._0520;

public class Solution {
    public boolean detectCapitalUse(String word) {
        int l = word.length();

        int upperCaseCount = 0;
        boolean isFirstCharUpperCase = Character.isUpperCase(word.charAt(0)) ? true : false;

        for (int i = 0; i < l; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            }
        }

        if (!isFirstCharUpperCase && upperCaseCount == 0) {
            return true;
        }

        if (isFirstCharUpperCase && (upperCaseCount == 1 || upperCaseCount == l)) {
            return true;
        }

        return false;
    }
}
