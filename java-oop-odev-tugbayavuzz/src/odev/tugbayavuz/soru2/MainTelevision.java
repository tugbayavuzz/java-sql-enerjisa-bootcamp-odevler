package odev.tugbayavuz.soru2;

public class MainTelevision {
    public static void main(String[] args) {
        Television television = new Television(10, 10, 10);
        television.power(true);
        television.increaseVolume();
        television.decreaseVolume();
        television.power(false);
        //System.out.println(television.screenSize);  'screenSize' has private access in 'odev.tugbayavuz.soru2.Television'
        //System.out.println(television.maxVolume=10); Cannot assign a value to final variable 'maxVolume'
    }
}
