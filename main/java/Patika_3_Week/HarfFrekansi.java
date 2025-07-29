package Patika_3_Week;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir metin girişi alma
        System.out.println("Kelime giriniz: ");
        String kelime = scanner.nextLine();

        // Tüm harfleri küçük harfe çeviriyoruz ve Map oluşturuyoruz
        kelime = kelime.toLowerCase();
        Map<Character, Integer> frekans = new HashMap<>();

        // Her karakteri kontrol et
        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);

            // Sadece harf olan karakterleri say
            if (Character.isLetter(c)) {
                // Map'te varsa sayısını 1 artır, yoksa 1 olarak başlat
                frekans.put(c, frekans.getOrDefault(c, 0) + 1);
            }
        }
        // Frekansları ekrana satır satır yazdır
        frekans.forEach((harf, adet) -> System.out.println(harf + " = " + adet));

    }
}
