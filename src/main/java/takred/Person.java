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

    public Person(Person person) {
        this.name = person.name;
        this.surname = person.surname;
        this.passportNumber = person.passportNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 30;
        int result = 1;
        result = prime * result + (2 * (name.length() + surname.length()));
        result = prime * result + ((name.length() + surname.length()) / 2);
        result = prime * result + passportNumber;

        return result;
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

    @Override
    public boolean equals(Object person) {
        if (this == person) {
            return true;
        }

        if (person == null) {
            return false;
        }

        if (getClass() != person.getClass()) {
            return false;
        }

        Person other = (Person) person;
        if (!name.equals(other.name)) {
            return false;
        }

        if (!surname.equals(other.surname)) {
            return false;
        }

        if (passportNumber != other.passportNumber) {
            return false;
        }

//        if (!name.equals(person.name)) {
//            return false;
//        }
//        if (!surname.equals(person.surname)) {
//            return false;
//        }
//        if (passportNumber != person.passportNumber) {
//            return false;
//        }
        return true;
    }
}
