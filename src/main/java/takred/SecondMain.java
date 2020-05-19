package takred;

import java.util.*;

public class SecondMain {

    public static Map<Person, Integer> duplicateFrequenciesPerson(List<Person> personList) {
        Map<Person, Integer> duplicateFrequencyMap = new HashMap<>();

        for (int i = 0; i < personList.size(); i++) {
            duplicateFrequencyMap.put(personList.get(i), 1);
            for (int j = 0; j < personList.size(); j++) {
                if (j != i) {
                    if (personList.get(i).equals(personList.get(j))) {
                        duplicateFrequencyMap.put(personList.get(i), duplicateFrequencyMap.get(personList.get(i)) + 1);
                    }
                }
            }
        }
        return duplicateFrequencyMap;
    }

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

        Map<Person, Integer> duplicateFrequencyMap = new HashMap<>(duplicateFrequenciesPerson(personList));
        var list = new ArrayList<>(duplicateFrequencyMap.entrySet());

        for (int i = 0; i < list.size(); i++) {
            var map  = list.get(i);
            if (map.getValue() > 1) {
                Person person = map.getKey();
                System.out.println("name - " + person.getName());
                System.out.println("surname - " + person.getSurname());
                System.out.println("passNumber - " + person.getPassportNumber());
                System.out.println("Встречается раз - " + map.getValue());
            }
        }
    }
}
