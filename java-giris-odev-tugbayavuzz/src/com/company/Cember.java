package com.company;


import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Cember {

    double radius;
    double alan;
    String color;


    public double area() {
        return alan = radius * radius * PI;
    }

    public double radius() {

        return radius = Math.sqrt(alan / (PI)) ;
    }

    public static void main(String[] args) {
// ana mainde de yazdım çalıştırdım.Kontrol ederken zorluk çıkarmasın diye buraya yazdım :)
        Cember cember = new Cember();
        cember.color="lila";
        cember.radius=5;
        System.out.println("alan = " + cember.area());
        System.out.println("yaricap = " + cember.radius());

    }
}
