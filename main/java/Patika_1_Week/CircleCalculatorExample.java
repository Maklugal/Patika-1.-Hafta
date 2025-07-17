package Patika_1_Week;
import java.util.Scanner;

public class CircleCalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını girin: ");
        double radius = scanner.nextDouble();

        double PI = 3.14159;

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        double area2 = Math.PI * radius * radius;
        double circumference2 = 2 * Math.PI * radius;

        System.out.println("Dairenin alanları " + area + " - " + area2);
        System.out.println("Dairenin çevresi " + circumference + " - " + circumference2);


    }

}
