package easy._0100_0199._0171;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return ans;
    }
}
