package easy._2500_2599._2506;

public class Solution {
    public int similarPairs(String[] words) {
        int l = words.length, count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (isSimilar(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSimilar(String s1, String s2) {
        int l1 = s1.length(), x1 = bitmask(s1, l1);
        int l2 = s2.length(), x2 = bitmask(s2, l2);

        return x1 == x2;
    }

    private int bitmask(String s, int l) {
        int x = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            x |= 1 << (c - 'a');
        }

        return x;
    }
}