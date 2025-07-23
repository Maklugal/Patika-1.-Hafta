package Patika_2_Week.Banking_System;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private CurrencyType currencyType;

    public BankAccount(String accountNumber, double balance, CurrencyType currencyType) {

        if (balance < 0) {
            System.out.println(" Eksik bakiye ile hesap oluşturamazsınız.");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public BankAccount(int accountNumber, double amount, CurrencyType currencyType) {
    }

    public void deposit(double amount) {
        if (amount < 0) {
            balance += amount;
            System.out.println(amount + " " + currencyType + " yatırıldı. Yeni bakiyeniz = " + balance + currencyType.getSembol());
        } else {
            System.out.println("Geçersiz tutar ! ");
        }

    }
}
