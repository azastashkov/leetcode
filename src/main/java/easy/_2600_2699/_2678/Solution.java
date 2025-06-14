package easy._2600_2699._2678;

public class Solution {
    public int countSeniors(String[] details) {
        int olderThan60Count = 0;
        for (String s : details) {
            int age = Integer.parseInt(s.substring(11, 13));
            if (age > 60) {
                olderThan60Count++;
            }
        }

        return olderThan60Count;
    }
}