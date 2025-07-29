package Patika_2_Week.Odevler;

import java.util.Scanner;

public class RecursiveMetod_PowerNumberExample {
    public static void main(String[] args) {
        // Recursive - Üs alma

        // 2 sayısının 3. kuvvetini alacaksın. 2*2*2= 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değeri giriniz: ");

        int base = scanner.nextInt();
        System.out.println("Üs değerini giriniz: ");
        int power = scanner.nextInt();

        int result = power(base, power);
        System.out.println(base + "^" + power + " = " + result);
    }

    private static int power(int base, int power) {
        if (power == 0) return 1;
        return base * power(base, power - 1); // 2 * (power( 2 * (power)*1))

    }

}
