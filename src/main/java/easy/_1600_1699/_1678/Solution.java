package easy._1600_1699._1678;

public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int l = command.length();
        int i = 0;
        while (i < l) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append('G');
                i++;
            } else if (c == '(') {
                char next = command.charAt(++i);
                if (next == ')') {
                    sb.append('o');
                    i++;
                } else if (next == 'a') {
                    sb.append("al");
                    i += 3;
                }
            }
        }

        return sb.toString();
    }
}