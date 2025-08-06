package easy._3000_3099._3042;

public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int l = words.length, count = 0;
        for (int i = 0; i < l; i++) {
            String str1 = words[i];
            for (int j = i + 1; j < l; j++) {
                String str2 = words[j];
                if (isPrefixAndSuffix(str1, str2)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}