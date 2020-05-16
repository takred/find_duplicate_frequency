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
        personList.add(new Person("Евлампий", "Евлампов", 9234567));

        List<DuplicateFrequency> duplicateFrequencyList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            duplicateFrequencyList.add(new DuplicateFrequency(personList.get(i), 0));
            for (int j = 0; j < personList.size(); j++) {
                if (j != i) {
                    if (personList.get(i).equals(personList.get(j))) {
                        duplicateFrequencyList.set(i, duplicateFrequencyList.get(i).setFrequency(duplicateFrequencyList.get(i).getFrequency() + 1));
                    }
                }
            }
        }

        for (int i = 0; i < duplicateFrequencyList.size(); i++) {
            if (duplicateFrequencyList.get(i).getFrequency() > 0) {
                Person person = duplicateFrequencyList.get(i).getObject();
                System.out.println("name - " + person.getName());
                System.out.println("surname - " + person.getSurname());
                System.out.println("passNumber - " + person.getPassportNumber());
                System.out.println("Повторов объекта в списке - " + duplicateFrequencyList.get(i).getFrequency());
            }
        }
    }
}
