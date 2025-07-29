package Patika_2_Week.Patika_2_Week_Pratikler;

import java.util.Scanner;

public class Gamediablo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Karakter seçiniz: \n 1-) Barbar \n 2-) Büyücü \n 3-) Druid");
        int karakter = scanner.nextInt();

        switch (karakter) {
            case 1:
                System.out.println(" Barbar şeçtiniz !");
                break;
            case 2:
                System.out.println("Büyüc seçtiniz !");
                break;
            case 3:
                System.out.println(" Druid seçtiniz !");
                break;
        }

    }
}
