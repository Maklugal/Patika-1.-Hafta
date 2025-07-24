package Patika_2_Week.Banking_System;

public class Customer {
    private String name;
    private String surname;
    private String phonenumber;
    private String password;
    private String identity;
    private BankAccount[] bankAccounts;
    private int bankAccountConter = 0;


    public Customer(String name, String surname, String password, String identity) {

        if (password.length() < 8 && password.length() >= 12) {
            System.out.println(" Şifreniz en az 8 en fazla 12 karakterden oluşmalıdır");
        } else {
            this.name = name;
            this.surname = surname;
            this.password = password;
            this.identity = identity;
            bankAccounts = new BankAccount[4];
            System.out.println(" Kullanıcı oluşturuldu ! " + this);
        }

    }

    public void addAccount(BankAccount bankAccount) {
        if (bankAccountConter < bankAccounts.length) {
            bankAccounts[bankAccountConter] = bankAccount;
            bankAccountConter++;
            System.out.println(" Yeni Hesap Eklendi: " + bankAccount.getAccountNumber());
        } else {
            System.out.println("Maksimum hesap limitine ulaşıldı ! ");
        }
    }

    public void listAccount() {
        System.out.println(getName() + " adlı kullanıcının hesapları: ");
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }


    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
