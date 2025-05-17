package easy._2100_2199._2138;

public class Solution {
    public String[] divideString(String s, int k, char fill) {
        int l = s.length();
        int n = l % k == 0 ? l / k : l / k + 1;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i * k; j < Math.min(l, i * k + k); j++) {
                sb.append(s.charAt(j));
            }
            while (sb.length() < k) {
                sb.append(fill);
            }
            arr[i] = sb.toString();
        }

        return arr;
    }
}