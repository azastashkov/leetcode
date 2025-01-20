package easy._0100_0199._0168;

public class Solution {
    public String convertToTitle(int columnNumber) {
        final char[] alphabet = new char[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet[c - 'A'] = c;
        }

        StringBuilder sb = new StringBuilder();
        while (columnNumber-- > 0) {
            sb.append(alphabet[columnNumber % alphabet.length]);
            columnNumber /= alphabet.length;
        }

        return sb.reverse().toString();
    }
}
