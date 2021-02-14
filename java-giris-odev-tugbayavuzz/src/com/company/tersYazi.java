package com.company;

import java.util.Scanner;

public class tersYazi {
    public static void main(String[] args) {
        String cumle = "", tersCumle = "";
        Scanner in = new Scanner(System.in);

        while (cumle != null) {
            cumle = "";
            tersCumle = "";
            System.out.println("Cumle giriniz: ");
            cumle = in.nextLine(); // cumleyi kaydettik

            int length = cumle.length(); // girilen cumle uzunluğu
            for (int i = length - 1; i >= 0; i--)
                tersCumle = tersCumle + cumle.charAt(i);

            System.out.println(tersCumle);
        }
    }
}
