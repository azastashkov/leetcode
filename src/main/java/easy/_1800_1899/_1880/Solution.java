package easy._1800_1899._1880;

public class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return numericalValue(firstWord) + numericalValue(secondWord) == numericalValue(targetWord);
    }

    private int numericalValue(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            sb.append(s.charAt(i) - 'a');
        }

        return Integer.parseInt(sb.toString());
    }
}