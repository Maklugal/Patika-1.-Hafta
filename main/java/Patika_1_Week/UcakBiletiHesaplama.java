package Patika_1_Week;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 - Tek Yön, 2 - Gidiş Dönüş): ");
        int tip = scanner.nextInt();


        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double birimFiyat = 0.10;
        double normalTutar = mesafe * birimFiyat;
        double yasIndirimOrani = 0;


        if (yas < 12) {
            yasIndirimOrani = 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimOrani = 0.10;
        } else if (yas > 65) {
            yasIndirimOrani = 0.30;
        }


        double yasIndirimi = normalTutar * yasIndirimOrani;
        double indirimliTutar = normalTutar - yasIndirimi;


        if (tip == 2) {
            indirimliTutar -= indirimliTutar * 0.20;
            indirimliTutar *= 2;
        }

        System.out.printf("Toplam Bilet Fiyatı: %.2f TL\n", indirimliTutar);
    }
}
