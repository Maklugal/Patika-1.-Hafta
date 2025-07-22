package Patika_2_Week;

import java.util.Scanner;

public class RecursiveMetod_Reversed_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz:");

        String input = scanner.nextLine();
        String reversedString = reserse(input);
        System.out.println(reversedString);
    }

    private static String reserse(String input) {

        if (input.isEmpty()) return input;

        return reserse(input.substring(1)) + input.charAt(0);
    }
}
