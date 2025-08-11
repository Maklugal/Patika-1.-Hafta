package Patika_5_Week.InnerClassOdev;

public class Test {
    public static void main(String[] args) {

        // Çalışan oluşturma
        Employee emp = new Employee("Mehmet Aşar", "Kıribiş");

        // İletişim bilgilerini oluşturma
        Employee.ContactInfo contact = emp.createContactInfo("0555 555 55 55 ", "mehmet@example.com");

        // Bilgileri gösterme
        contact.showContactInfo();

    }
}
