package easy._2700_2799._2744;

public class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int l = words.length, count = 0;
        for (int i = 0; i < l; i++) {
            String s1 = words[i];
            for (int j = i + 1; j < l; j++) {
                String s2 = new StringBuilder(words[j]).reverse().toString();
                if (s1.equals(s2)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}