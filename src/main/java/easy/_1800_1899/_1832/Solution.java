package easy._1800_1899._1832;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        int l = sentence.length();
        for (int i = 0; i < l; i++) {
            count[sentence.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                return false;
            }
        }

        return true;
    }
}