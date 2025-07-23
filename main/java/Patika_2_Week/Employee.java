package Patika_2_Week;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return salary < 1000 ? 0.0 : salary * 0.03;
    }

    public double bonus() {
        return workHours > 40 ? (workHours - 40) * 30 : 0.0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearWorked = currentYear - hireYear;

        if (yearWorked < 10) {
            return salary * 0.05;
        } else if (yearWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma saati: " + workHours +
                "\nBaşlangıç yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş artışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş: " + totalSalary;
    }

}
