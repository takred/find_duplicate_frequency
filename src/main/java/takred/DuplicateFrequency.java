package takred;

public class DuplicateFrequency {
    private final Person person;
    private final int frequency;

    public DuplicateFrequency(Person person, int frequency) {
        this.person = person;
        this.frequency = frequency;
    }

    public Person getPerson() {
        return person;
    }

    public int getFrequency() {
        return frequency;
    }

    public DuplicateFrequency setFrequency(int frequency) {
        return new DuplicateFrequency(person, frequency);
    }
}
