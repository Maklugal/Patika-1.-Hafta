package Patika_2_Week.Odevler;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifreyi giriniz: ");
        String sifre = scanner.nextLine();

        boolean kural1 = sifre.length() >= 8;
        boolean kural2 = !sifre.contains(" ");
        boolean kural3 = !sifre.isEmpty() && Character.isUpperCase(sifre.charAt(0));
        boolean kural4 = sifre.endsWith("?");

        if (kural1 && kural2 && kural3 && kural4) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }
}

