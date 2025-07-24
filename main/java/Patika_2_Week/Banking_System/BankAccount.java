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

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public double getBalance() {
        return balance;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", currencyType=" + currencyType +
                '}';
    }

    public void withDraw(double amuont) {
        if (amuont > 0 && amuont <= balance) {
            balance -= amuont;
            System.out.println(amuont + " " + currencyType.getSembol() + "çekildi. Yeni bakiyeniz = " + balance + currencyType.getSembol());
        } else if (amuont > balance) {
            System.out.println(" Yetersiz bakiye ! ");
        } else {
            System.out.println(" Geçersiz tutar ! ");
        }


    }

}
