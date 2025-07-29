package Patika_2_Week.Odevler;

import java.util.Scanner;

public class MetodPratik_Palidrom {
    public static void main(String[] args) {

        // Pallindrom : Bir sayının tersi alındığında da aynı olan sayıdır. Örneğin : 121.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int number = scanner.nextInt();

        boolean isPalindromNumber = isPalindrom(number);
        if (isPalindromNumber) { // burda ekstra true ise çalış demeye gerek yok çümnü üstte boolen değer zaten true olursa çalışacak.
            System.out.println(number + "Bir palidrom sayıdır.");
        } else {
            System.out.println(number + "Bir palidrom değildir.");
        }
    }

    private static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10; // numberı 10a böl ve tekrar numbre esıtle
        }
        return originalNumber == reversedNumber;
    }


}
