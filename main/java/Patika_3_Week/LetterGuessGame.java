package Patika_3_Week;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterGuessGame {
    public static void main(String[] args) {

        // Scanner sanıfı ile kullanıcıdan veri alacağız
        Scanner scanner = new Scanner(System.in);

        // 4 elemanlı bir Arraylist oluşturuluyor ve rasgele harfler ekleniyor.
        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("k");
        letters.add("m");
        letters.add("z");

        // Kullanıcı 4 kez harf girişi yapacak
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " . harfi giriniz: ");
            String userScanner = scanner.nextLine().toLowerCase(); // Küçük harfe çeviriyoruz

            // Eğer harf listesinde varsa, o harfin yerini "found" ile değiştiriyoruz
            if (letters.contains(userScanner)) {
                int index = letters.lastIndexOf(userScanner);
                letters.set(index, "found");
                System.out.println(" Harf bulundu! Listede güncellendi. ");
            } else {
                // Harf listede yoksa, listeye ekleniyor
                letters.add(userScanner);
                System.out.println(" Harf bulunamadı, listeye eklendi. ");
            }
        }

        // Güncellenmiş liste ekrana yazdırılıyor
        System.out.println("\nGüncellenmiş Harf Listesi: ");
        System.out.println(letters);


    }
}
