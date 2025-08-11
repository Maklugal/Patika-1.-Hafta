package Patika_5_Week.InnerClassOdev;

// Dış sınıf ( Outher Class )
public class Employee {
    private final String firstName;
    private final String lastName;

    // Inner Class ( Non - Static)
    public class ContactInfo {
        private final String phone;
        private final String email;

        public ContactInfo(String phone, String email) {
            this.phone = phone;
            this.email = email;
        }

        public void showContactInfo() {
            // Inner class, dış sınıfın üyerlerine doğrudan erişebilir
            System.out.println(" Çaşlışan : " + firstName + " " + lastName);
            System.out.println(" Telefon : " + phone);
            System.out.println(" E posta : " + email);

        }
    }

    // Employee kurucu metodu
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // ContactInfo nesnesi oluşturma metodu
    public ContactInfo createContactInfo(String phone, String email) {
        return new ContactInfo(phone, email);
    }
}
