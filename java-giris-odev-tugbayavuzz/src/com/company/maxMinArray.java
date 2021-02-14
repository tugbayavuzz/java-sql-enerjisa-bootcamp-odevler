package com.company;

public class maxMinArray {
    public static void main(String[] args) {
        int arr[] = {3, 0, 4, 5};
        int arr2[] = {45, 38, 47, 5, 89, 17};
        int arr3[] = {15, 38, 45, -1, 68, 25};
        int arr4[] = {109, 55, 47, 1, 65, 48, 78, 32};
        maxSayi(arr);
        maxSayi(arr4);
        minSayi(arr3);
        minSayi(arr2);
    }

    static void maxSayi(int sayi[]) {
        int max = sayi[0];
        for (int i = 1; i < sayi.length; i++) {
            if (max < sayi[i]) {
                max = sayi[i];
            }
        }
        System.out.println(max);
    }

    static void minSayi(int sayi[]) {
        int min = sayi[0];
        for (int i = 1; i < sayi.length; i++) {
            if (min > sayi[i]) {
                min = sayi[i];
            }
        }
        System.out.println(min);
    }
}
