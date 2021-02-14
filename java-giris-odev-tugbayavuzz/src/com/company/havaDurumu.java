package com.company;

import java.util.Scanner;

public class havaDurumu {

    public static void main(String[] args) {

        System.out.println("Derece giriniz: "); // kullanıcıdan sayı alındı
        int derece = new Scanner(System.in).nextInt();

        if (derece < 20) {
            System.out.println("Hava soğuk");
        } else if (derece >= 20 && derece <= 30) {
            System.out.println("Hava ılık");
        } else if (derece > 30) {
            System.out.println("Sıcak");
        }
    }

}
