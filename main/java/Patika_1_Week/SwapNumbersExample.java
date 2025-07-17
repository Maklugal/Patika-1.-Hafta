package Patika_1_Week;

import java.util.Scanner;

public class SwapNumbersExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu ( metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kg = scanner.nextDouble();

        double Vki = kg / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + Vki);
    }
}
