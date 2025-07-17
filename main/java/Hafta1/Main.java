package Hafta1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + ", " + age + " yaşındasın! ");

        scanner.close();


    }
}
