package com.company;

import java.util.Scanner;

public class palindromSayi {
    public static void main(String[] args) {
        //1.soru cevabı
        System.out.println("Bir number giriniz: "); // kullanıcıdan sayı alındı
        int sayi = new Scanner(System.in).nextInt();

        if (palindrom(sayi)) {
            System.out.println(+sayi + " sayisi palindrom bir sayıdır");
        } else {
            System.out.println(+sayi + " sayisi palindrom bir sayı değildir");
        }


    }

    public static boolean palindrom(int number) {
        int palindromSayi = number;
        int ters = 0;
// 6 tek sayı karsılaştıralacak bir sayısı yok
// bu yüzden cift basamak ve daha fazlası ise palindrom olup olmadığını anlamak için bu  sart koyuldu
        if (palindromSayi > 10) {
            while (palindromSayi != 0) { //palindrom sayının basamaklarını buluyoruz
                int kalan = palindromSayi % 10;
                ters = ters * 10 + kalan;
                palindromSayi = palindromSayi / 10;
            }
        }
        if (number == ters) {
            return true;
        } else
            return false;
    }
}
