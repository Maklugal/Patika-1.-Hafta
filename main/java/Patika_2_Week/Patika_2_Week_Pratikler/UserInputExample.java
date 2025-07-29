package Patika_2_Week.Patika_2_Week_Pratikler;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.println(" Soyadınızı giriniz: ");
        String lastName = scanner.nextLine();

        System.out.println(" Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println(" Merhaba " + name + " " + lastName + " Hoşgeldiniz !" + age + " Yaşındasınız. ");

        scanner.close();
    }
}
