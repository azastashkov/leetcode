package easy._0900_0999._0944;

public class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int columns = strs[0].length();
        int count = 0;
        for (int c = 0; c < columns; c++) {
            char ch = strs[0].charAt(c);
            for (int r = 1; r < rows; r++) {
                char cr = strs[r].charAt(c);
                if (ch > cr) {
                    count++;
                    break;
                }
                ch = cr;
            }
        }

        return count;
    }
}