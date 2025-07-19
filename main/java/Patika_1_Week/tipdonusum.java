package Patika_1_Week;

import java.util.Scanner;

public class tipdonusum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan tam sayı al
        System.out.print("Bir tam sayı giriniz: ");
        int tamsayi = scanner.nextInt();

        //Kullanıcıdan ondalık sayı al
        System.out.print("Bir ondalık sayı giriniz: ");
        double ondaliksayi = scanner.nextDouble();

        //Tam sayıyı double'a dönüştür
        double tamdandouble = tamsayi;

        // Ondalıklı sayıyı int'e dönüştür
        int doubledanint = (int) ondaliksayi;

        //Sonuçları ekrana yazdıralım
        System.out.println("\n --- Tip Dönüşüm Sonuçları ---");
        System.out.println("Tam sayı (int): " + tamsayi);
        System.out.println("Tam sayı -> Ondalıklı sayı (double):" + tamdandouble);
        System.out.println("Ondalıklı sayı (double): " + ondaliksayi);
        System.out.println("Ondalıklı sayı -> Tam sayı(int): " + doubledanint);

        scanner.close();
    }
}
