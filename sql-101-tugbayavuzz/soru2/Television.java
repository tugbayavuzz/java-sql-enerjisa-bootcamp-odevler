package odev.tugbayavuz.soru2;

public class Television {
    int width;
    int height;
    private int screenSize;
    final int maxVolume = 100;
    int volume = 0;
    boolean power;

    //Constructor
    Television(int width, int height, int screenSize) {
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
    }

    public void power(boolean power) {
        this.power = power;
    }

    public void increaseVolume() {
        if (this.volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (this.volume > 0) {
            volume--;
        }
    }

}