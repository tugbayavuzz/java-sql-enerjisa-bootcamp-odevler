package odev.tugbayavuz.soru1;

public class MainCalculator {
    public static void main(String[] args) {
        AdvancedCalculator calculator = new AdvancedCalculator();

        System.out.println("Çarpma işlemi sonucu: " + calculator.multiply(5, 7));
        System.out.println("Bölme işlemi sonucu: " + calculator.divide(8, 4));
        System.out.println("Kare alma sonucu: " + calculator.sqrt(5));
        System.out.println("Küp alma sonucu " + calculator.cube(5));


    }
}
