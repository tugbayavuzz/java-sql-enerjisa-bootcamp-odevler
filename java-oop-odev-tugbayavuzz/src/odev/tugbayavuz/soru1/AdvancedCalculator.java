package odev.tugbayavuz.soru1;

public class AdvancedCalculator extends BasicCalculator implements Scientific {
    @Override
    public double sqrt(double x) {
        return x * x;
    }

    @Override
    public double cube(double x) {
        return x * x * x;
    }
}
