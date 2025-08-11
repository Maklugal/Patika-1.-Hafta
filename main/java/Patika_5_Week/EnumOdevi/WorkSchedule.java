package Patika_5_Week.EnumOdevi;

import java.util.Locale;
import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bir gün giriniz (Örnek: MONDAY) : ");
        String inputday = scanner.nextLine().toUpperCase(Locale.ENGLISH);

        try {
            Day selectedDay = Day.valueOf(inputday); // Enum sabiti bulur
            System.out.println(selectedDay + " work hours " + selectedDay.getWorkHours());
        } catch (IllegalArgumentException e) {
            System.out.println(" Invalid day entered! ");
        }
    }
}
