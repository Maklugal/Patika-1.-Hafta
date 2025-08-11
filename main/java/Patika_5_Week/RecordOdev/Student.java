package Patika_5_Week.RecordOdev;

public record Student(String firstName, String lastName, int studentNumber) {

    /* Java Records otomatik olarak
       - final alanlar
       - constructor
       - getter'lar (alan isimleri ile)
       - equals() ve hashCode ()
       - toString()
       - metodlarını oluşturur.
     */
}

class Main {
    public static void main(String[] args) {

        // Öğrenci nesneleri oluşturma
        Student student1 = new Student("Ali", "Yılmaz", 101);
        Student student2 = new Student("Ayşe", "Kara", 102);
        Student student3 = new Student("Ali", "Yılmaz", 101);

        // Öğrenci bilgilerini ekrana yazdırma
        System.out.println(student1);
        System.out.println(student2);

        // equals ve hashcode testleri
        System.out.println("student1.equals(student3): " + student1.equals(student3)); // true
        System.out.println("student1.hasCode() == student3.hashCode(): " + (student1.hashCode() == student3.hashCode())); // true

        // Getter gibi çalışır: alan adını çağırmak
        System.out.println("Student1 Adı: " + student1.firstName());
    }
}
