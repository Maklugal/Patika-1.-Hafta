package Patika_2_Week.Odevler;

import java.util.Scanner;

public class RecursiveMetod_DigitSumExample {
    public static void main(String[] args) {

        // 123 -> 1+2+3 = 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = sumofdigits(number);
        System.out.println(number + "basamak toplamı = " + sum);
    }

    private static int sumofdigits(int number) {
        if (number == 0) return 0;
        return (number % 10) + sumofdigits(number / 10);
    }

}
