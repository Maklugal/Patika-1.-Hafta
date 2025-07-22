package Patika_2_Week;

import java.util.Scanner;

public class RecursiveVeAsalKontol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();


        if (asalmi(sayi, sayi - 1)) {
            System.out.println(sayi + " sayısı ASALDIR ! ");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }

    // _define-ocg_ Recursice asal kontrol fonksiyonu
    private static boolean asalmi(int sayi, int bolen) {

        // Bölene kadar geldiysek ve hiçbir bölen yoksa asaldır.
        if (bolen == 1) {
            return true;
        }

        // Sayı bölene tam bölünüyorsa Asal değildir.
        if (sayi % bolen == 0) {
            return false;
        }

        // Rekürsif olarak bir önceki böleni dene.
        return asalmi(sayi, bolen - 1);
    }

}
