package Patika_5_Week.EnumOdevi;

// Day.java
public enum Day {
    SUNDAY("Çalışma yok "), // Tatil
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("09:00 - 13:00"); // Yarım gün örneği

    private final String workHours;

    // Enum constructor
    Day(String workHours) {
        this.workHours = workHours;
    }

    // Çelışma saatini döndüren metot


    public String getWorkHours() {
        return workHours;
    }
}
