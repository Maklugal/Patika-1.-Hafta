package Patika_3_Week.ProjeKitap.model;

import Patika_3_Week.ProjeKitap.model.enums.Gender;

import java.time.LocalDate;

public class Author {
    private String name;
    private final String surname;
    private Gender gender;
    private LocalDate birthday;
    private String bio;

    public Author(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", bio='" + bio + '\'' +
                '}';
    }
}
