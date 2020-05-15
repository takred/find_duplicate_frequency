package com.company;

public class Person {
    private final String name;
    private final String surname;
    private final int passportNumber;

    public Person(String name, String surname, int passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPassportNumber() {
        return passportNumber;
    }
}
