package easy._1600_1699._1603;

public class ParkingSystem {
    static final int BIG = 1;
    static final int MEDIUM = 2;
    static final int SMALL = 3;

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case BIG:
                if (big - 1 >= 0) {
                    big--;
                    return true;
                }
                break;
            case MEDIUM:
                if (medium - 1 >= 0) {
                    medium--;
                    return true;
                }
                break;
            case SMALL:
                if (small - 1 >= 0) {
                    small--;
                    return true;
                }
                break;
        }

        return false;
    }
}