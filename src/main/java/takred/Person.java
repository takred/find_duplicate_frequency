package takred;

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

    public boolean equals(Person person) {
        if (!name.equals(person.name)) {
            return false;
        }
        if (!surname.equals(person.surname)) {
            return false;
        }
        if (passportNumber != person.passportNumber) {
            return false;
        }
        return true;
    }
}
