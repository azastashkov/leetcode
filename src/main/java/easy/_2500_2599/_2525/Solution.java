package easy._2500_2599._2525;

public class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = isBulky(length, width, height);
        boolean heavy = isHeavy(mass);
        if (bulky && heavy) {
            return "Both";
        }

        if (!bulky && !heavy) {
            return "Neither";
        }

        if (bulky) {
            return "Bulky";
        }

        return "Heavy";
    }

    private boolean isBulky(long length, long width, long height) {
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            return true;
        }

        if (length * width * height >= 1000000000L) {
            return true;
        }

        return false;
    }

    private boolean isHeavy(long mass) {
        return mass >= 100;
    }
}