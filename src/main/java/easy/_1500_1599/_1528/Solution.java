package easy._1500_1599._1528;

public class Solution {
    public String restoreString(String s, int[] indices) {
        int l = s.length();
        char[] chars = new char[l];

        for (int i = 0; i < l; i++) {
            chars[indices[i]] = s.charAt(i);
        }

        return new String(chars);
    }
}