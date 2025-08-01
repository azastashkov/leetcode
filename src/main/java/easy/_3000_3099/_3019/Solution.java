package easy._3000_3099._3019;

public class Solution {
    public int countKeyChanges(String s) {
        int l = s.length();
        char[] chars = s.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 1; i < l; i++) {
            if (chars[i - 1] != chars[i]) {
                count++;
            }
        }

        return count;
    }
}