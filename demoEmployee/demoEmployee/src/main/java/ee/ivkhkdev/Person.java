package ee.ivkhkdev;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String phone;
    private Address address;

    public Person(String name, String surname, int birthYear, int birthMonth, int birthDay, String phone, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.phone = phone;
        this.address = address;
    }

    public Person(String name, String surname, int birthYear, int birthMonth, int birthDay, int phone) {
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && birthMonth == person.birthMonth && birthDay == person.birthDay && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(phone, person.phone) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, birthMonth, birthDay, phone, address);
    }
    public int age(){
        LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate now = LocalDate.now();

        return Period.between(birthdate, now).getYears();
    }
}
