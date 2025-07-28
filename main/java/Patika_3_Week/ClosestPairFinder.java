package Patika_3_Week;

import java.util.ArrayList;
import java.util.Collections;

public class ClosestPairFinder {
    public static void main(String[] args) {

        // Bir Arraylist oluşturuluyor, içine 10 tane pozitif ve benzersiz sayı ekleniyor.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(7);
        numbers.add(19);
        numbers.add(42);
        numbers.add(3);
        numbers.add(56);
        numbers.add(21);
        numbers.add(13);
        numbers.add(90);
        numbers.add(61);

        // Sayılar küçükten büyüğe sıralanıyor.
        Collections.sort(numbers);

        // En küçük farkı ve en yakın iki sayıyı tutacak değişkenler tanımlanıyıor.

        int minDifference = Integer.MAX_VALUE; // Başlangıçta en büyük değer atanır.
        int num1 = 0, num2 = 0; // En yakın iki sayı burda tutulacak.

        // Listedeki ardışık sayıların farkları karşılaştırılıyor
        for (int i = 0; i < numbers.size() - 1; i++) {
            int current = numbers.get(i);   // Şu anki sayı
            int next = numbers.get(i + 1);  // Bir sonraki sayı
            int diff = next - current;      // İki sayı arasındaki fark

            if (diff < minDifference) {
                minDifference = diff;
                num1 = current;
                num2 = next;
            }
        }

        // Sonuçlar ekrana yazdırılıyor

        System.out.println(" Sayılar (Sıralı): " + numbers);
        System.out.println(" Birbirine en yakın sayılar : " + num1 + " ve " + num2);
        System.out.println(" Bu sayıların farkı: " + minDifference);


    }
}
