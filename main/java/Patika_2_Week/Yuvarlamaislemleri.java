package Patika_2_Week;

import java.util.Scanner;

public class Yuvarlamaislemleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalıklı bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        int asagiYuvarlama = (int) Math.floor(sayi);
        int yukariYuvarlama = (int) Math.ceil(sayi);
        int enYakin = (int) Math.round(sayi);

        System.out.println("Aşağı Yuvarlama: " + asagiYuvarlama);
        System.out.println("Yukarı Yuvarlama: " + yukariYuvarlama);
        System.out.println("En Yakın Tam Sayı: " + enYakin);
    }
}
