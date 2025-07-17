package Patika_1_Week;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutfiyatı = 2.14;
        double elmafiyatı = 3.67;
        double domatesfiyatı = 1.11;
        double muzfiyatı = 0.95;
        double patlicanfiyatı = 5.00;

        System.out.println("Armut kaç kilo : ");
        double armutkg = scanner.nextDouble();

        System.out.println("Elma kaç kilo : ");
        double elmakg = scanner.nextDouble();

        System.out.println("Domatas kaç kilo : ");
        double domateskg = scanner.nextDouble();

        System.out.println("Muz kaç kilo : ");
        double muzkg = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo : ");
        double patlıcankg = scanner.nextDouble();

        double toplamtutar = (armutkg * armutfiyatı) +
                (elmakg*elmafiyatı) +
                (domateskg * domatesfiyatı ) +
                (muzkg*muzfiyatı) +
                (patlıcankg*patlicanfiyatı);

        System.out.printf( "Toplam Tutar : %.2f TL" , toplamtutar);




    }
}
