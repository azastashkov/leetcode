package easy._1600_1699._1668;

public class Solution {
    public int maxRepeating(String sequence, String word) {
        int max = 0;
        String rep = word;
        while (sequence.contains(rep)) {
            rep += word;
            max++;
        }

        return max;
    }
}