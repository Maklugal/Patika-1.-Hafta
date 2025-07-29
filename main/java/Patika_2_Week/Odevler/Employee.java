package Patika_2_Week.Odevler;

class Main {
    public static void main(String[] args) {

        // Bir çalışan (Employee) nesnesi oluşturuyoruz.
        Employee emp1 = new Employee("Kemal", 2000.0, 45, 1985);

        // Çaşışan bilgilieri ve hesaplanan maaş detaylarını yazdırıyoruz.
        System.out.println(emp1);
    }
}

// Employee sınıfı: Çalışan bilgilerini tutar ve maaş hesaplamaları yapar.
class Employee {

    // Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Constructor : Nesne oluştururken ilk değerler atanır.
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Maaşa vergi uygular. 1000 TL altı ise verdi yok, üstü ise %3 vergi uygulanır.
    public double tax() {
        return salary < 1000 ? 0.0 : salary * 0.03;
    }

    // Bonus: Haftalık 40 saatin üzerindeki her saat için 30 TL bonus eklenir.
    public double bonus() {
        return workHours > 40 ? (workHours - 40) * 30 : 0.0;
    }


    // raiseSalary(): ÇAlışma süresine göre zam hesaplar.
    // 10 yıldan az: %5, 10-19 yıl arası: %10, 20 yıl ve üstü : %15
    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // toString : Tüm çalışan bilgilerini ve hesapları yazdıran metot.
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş: " + totalSalary;
    }
}
