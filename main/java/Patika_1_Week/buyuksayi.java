package Patika_1_Week;

import java.util.Scanner;

public class buyuksayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kaç sayı girileceğinizi kullanıcıdan alıyoruz.
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        //Değişkeni tanım
        int sayi;
        int enbuyuk = Integer.MIN_VALUE;
        int enkucuk = Integer.MAX_VALUE;

        // N adet sayı

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " sayıyı giriniz: ");
            sayi = scanner.nextInt();

            // Sayma sayısı kontrolü
            if (sayi < 0) {
                System.out.println("Sayma sayısı negatif olamaz ! Lütfen tekrar giriniz. ");
                i--; // geçersiz giriş olduğu için sayaç azaltır
                continue;
            }
            // En büyük ve en küçük kontrol
            if (sayi > enbuyuk) {
                enbuyuk = sayi;
            }
            if (sayi < enkucuk) {
                enkucuk = sayi;
            }
        }
        // Sonuçları yazdır.
        System.out.println("En büyük sayı: " + enbuyuk);
        System.out.println("En küçük sayı: " + enkucuk);

    }
}
