package easy._1400_1499._1496;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        int i = 0, j = 0, l = path.length();
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        for (int k = 0; k < l; k++) {
            switch (path.charAt(k)) {
                case 'N' -> --i;
                case 'S' -> ++i;
                case 'E' -> ++j;
                case 'W' -> --j;
            }

            int nodeId = i * 20000 + j;
            if (!visited.add(nodeId)) {
                return true;
            }
        }

        return false;
    }
}