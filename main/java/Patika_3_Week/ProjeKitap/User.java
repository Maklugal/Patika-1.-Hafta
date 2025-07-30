package Patika_3_Week.ProjeKitap;

import Patika_3_Week.ProjeKitap.model.Order;
import Patika_3_Week.ProjeKitap.model.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private final String name;
    private final String email;
    private final String password;
    private Gender gender;
    private LocalDate birthyDay;
    private final LocalDate createdDate;
    private final Boolean isActive;
    private final List<Order> orderList = new ArrayList<>();

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdDate = LocalDate.now();
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthyDay() {
        return birthyDay;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthyDay=" + birthyDay +
                ", createdDate=" + createdDate +
                ", isActive=" + isActive +
                ", orderList=" + orderList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
