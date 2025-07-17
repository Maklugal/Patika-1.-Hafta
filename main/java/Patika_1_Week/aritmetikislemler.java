package Patika_1_Week;

import java.util.Scanner;

public class aritmetikislemler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sayısını giriniz: ");
        int a = scanner.nextInt();

        System.out.print("B sayısını giriniz: ");
        int b = scanner.nextInt();

        System.out.print("C sayısını giriniz: ");
        int c = scanner.nextInt();

        int sonuc = a + b * c - b;
        System.out.println("Sonuç " + sonuc);
    }
}
