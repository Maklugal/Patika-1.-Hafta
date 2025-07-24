package Patika_2_Week.Odevler;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üst sınırı giriniz (1-10): ");
        int n = scanner.nextInt();

        // Girdi kontrolü
        if (n < 1 || n > 10) {
            System.out.println("Hatalı giriş! Lütfen 1 ile 10 arasında bir sayı giriniz.");
            return; // Programı sonlandır
        }

        // Çarpım tablosunu yazdır
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%-4d", i * j); // Hizalı çıktı
            }
            System.out.println(); // Yeni satıra geç
        }

        scanner.close();
    }
}
