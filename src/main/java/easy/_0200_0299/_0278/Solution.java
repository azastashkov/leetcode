package easy._0200_0299._0278;

public abstract class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, h = n;

        while (l < h) {
            int v = l + (h - l) / 2;

            if (isBadVersion(v)) {
                h = v;
            } else {
                l = v + 1;
            }
        }

        return l;
    }
}
