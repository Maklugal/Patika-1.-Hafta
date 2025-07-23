package Patika_2_Week.Banking_System;

import java.util.Scanner;

public class BankingSystem {

    private static final Customer[] customers = new Customer[10];

    public static void main(String[] args) {


        Customer customer = new Customer("Elif", "Ak", "12345678", "12345678910");
        customers[0] = customer;
        menu();


    }

    private static void menu() {

        Scanner scanner = new Scanner(System.in);
        validatePassword();

        int choise;
        do {
            System.out.println("----- Bankacılık işlemleri ----- ");
            System.out.println(" 1 - Yeni Hesap Aç");
            System.out.println(" 2- Hesaplarını Listele ");
            System.out.println("3- Hesap seç ve işlem Yap");
            System.out.println(" Çıkış Yap ");
            System.out.print(" Seçimizi Yapın");

            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println(" Başlangıç bakiyesi girin: ");
                    double amount = scanner.nextDouble();
                    System.out.println(" Para Birimi Seçiniz: 1 - TL | 2 - DOLAR | 3- EURO | 4 - ALTIN");
                    int currencyChoise = scanner.nextInt();

                    CurrencyType currencyType = switch (currencyChoise) {
                        case 1 -> CurrencyType.TL;
                        case 2 -> CurrencyType.DOLAR;
                        case 3 -> CurrencyType.EURO;
                        case 4 -> CurrencyType.ALTIN;
                        default -> {
                            System.out.println(" Geçersiz birim seçtiniz ! ");
                            yield CurrencyType.TL;
                        }
                    };

                    String customerName = customers[0].getName();
                    String accountNumber = customerName.charAt(0) + customerName.length() + currencyChoise + "-";
                    BankAccount bankAccount = new BankAccount(accountNumber, amount, currencyType);
                    customers[0].getBankAccounts()[0] = bankAccount;
            }

        } while (choise != 0);

        System.out.println(" Bankamızı Seçtiğiniz için Teşekkürler !");


    }

    private static void validatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Merhaba " + customers[0].getName());
        int wrongPasswordCounter = 0;

        do {
            System.out.print("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if (!customers[0].getPassword().equals(password)) {
                System.out.println(" Yanlış bir şifre girdiniz ! ");
                wrongPasswordCounter++;
            } else {
                System.out.println("Doğru Şifre Girdiniz. Bankacılık Menüsüne Aktarılıyorsunuz. ");
                break;
            }

        } while (wrongPasswordCounter < 4);
    }
}
