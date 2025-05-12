package easy._2100_2199._2119;

public class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb = new StringBuilder();
        int reversed1 = Integer.parseInt(sb.append(num).reverse().toString());
        sb.setLength(0);
        int reversed2 = Integer.parseInt(sb.append(reversed1).reverse().toString());

        return num == reversed2;
    }
}