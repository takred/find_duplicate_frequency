package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Иван", "Иванов", 1234567));
        personList.add(new Person("Сергей", "Сергеев", 1234547));
        personList.add(new Person("Антон", "Антонов", 1264567));
        personList.add(new Person("Антон", "Антонов", 1264567));
        personList.add(new Person("Дмитрий", "Димов", 1234561));
        personList.add(new Person("Кирилл", "Кириллов", 1232567));
        personList.add(new Person("Александр", "Александров", 1234167));
        personList.add(new Person("Юлий", "Юлианов", 1834567));
        personList.add(new Person("Валентин", "Валентинов", 1236567));
        personList.add(new Person("Валентин", "Валентинов", 1236567));
        personList.add(new Person("Валентин", "Валентинов", 1236567));
        personList.add(new Person("Евлампий", "Евлампов", 9234567));

        List<DuplicateFrequency> duplicateFrequencyList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            duplicateFrequencyList.add(new DuplicateFrequency(personList.get(i), 1));
            for (int j = 0; j < personList.size(); j++) {
                if (j != i) {
                    if (personList.get(i).equals(personList.get(j))) {
                        duplicateFrequencyList.set(i, duplicateFrequencyList.get(i).setFrequency(duplicateFrequencyList.get(i).getFrequency() + 1));
                    }
                }
            }
        }

        List<DuplicateFrequency> sortDuplicateFrequencyList = new ArrayList<>();
        sortDuplicateFrequencyList.add(duplicateFrequencyList.get(0));
        for (int i = 0; i < duplicateFrequencyList.size(); i++) {
            for (int j = 0; j < sortDuplicateFrequencyList.size(); j++) {
                if (duplicateFrequencyList.get(i).getPerson().equals(sortDuplicateFrequencyList.get(j).getPerson())) {
                    break;
                }
                if (j == sortDuplicateFrequencyList.size() - 1) {
                    sortDuplicateFrequencyList.add(duplicateFrequencyList.get(i));
                }
            }
        }

        for (int i = 0; i < sortDuplicateFrequencyList.size(); i++) {
            if (sortDuplicateFrequencyList.get(i).getFrequency() > 1) {
                Person person = sortDuplicateFrequencyList.get(i).getPerson();
                System.out.println("name - " + person.getName());
                System.out.println("surname - " + person.getSurname());
                System.out.println("passNumber - " + person.getPassportNumber());
                System.out.println("Встречается раз - " + sortDuplicateFrequencyList.get(i).getFrequency());
            }
        }
    }
}
