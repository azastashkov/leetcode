package easy._2000_2999._2042;

public class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = 0;
        for (String w : words) {
            char c = w.charAt(0);
            if (Character.isDigit(c)) {
                int n = Integer.parseInt(w);
                if (n <= prev) {
                    return false;
                } else {
                    prev = n;
                }
            }
        }

        return true;
    }
}