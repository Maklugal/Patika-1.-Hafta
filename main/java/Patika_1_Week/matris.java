package Patika_1_Week;

import java.util.Scanner;

public class matris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matris boyutlarını alma
        System.out.print("Satır sayısını girin: ");
        int satir = scanner.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        int[][] matris = new int[satir][sutun];

        // Matrisi kullanıcıdan alma
        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz için yeni matris oluşturma
        int[][] transpoz = new int[sutun][satir];

        // Transpoz işlemi
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matrisi yazdırma
        System.out.println("\nOrijinal Matris:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matrisi yazdırma
        System.out.println("\nTranspoz (Devriği) Matris:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
