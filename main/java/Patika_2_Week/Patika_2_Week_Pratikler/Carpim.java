package Patika_2_Week.Patika_2_Week_Pratikler;

import java.util.Scanner;

public class Carpim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bir sayı giriniz: ");
        int number = scanner.nextInt();

        System.out.println(" İkinci sayıyı giriniz: ");
        int number2 = scanner.nextInt();

        int carpim = number * number2;

        System.out.println("Girdiğiniz sayıların çarpımı: " + carpim);

        scanner.close();
    }
}
