package easy._2400_2499._2469;

public class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[] { kelvin, fahrenheit };
    }
}